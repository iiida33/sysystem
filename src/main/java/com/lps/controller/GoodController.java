package com.lps.controller;

import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lps.exception.CustomException;
import com.lps.po.*;
import com.lps.service.ICategoryService;
import com.lps.service.IGoodPicService;
import com.lps.service.IGoodService;
import com.lps.service.IGoodSkuService;
import com.lps.vo.*;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: GoodController
 * @Description:
 * @Author: 梁培珊
 * @Date: 8:28 2019/3/17
 **/
@Controller
@RequestMapping("/good")
public class GoodController {

    @Autowired
    private IGoodService goodService;
    @Autowired
    private ICategoryService categoryService;
    @Autowired
    private IGoodSkuService goodSkuService;
    @Autowired
    private IGoodPicService goodPicService;

    //    展示商品信息
    @RequestMapping("/showGoodMes.do")
    @ResponseBody
    public List<Good> showGoodMes() {
        return goodService.fineAll();
    }

    //    按照分类显示商品信息
    @RequestMapping("/showGoodMesByCate.do")
    @ResponseBody
    public List<GoodSimpleShow> showGoodMesByCate(int cateId) {
        List<GoodSimpleShow> goodSimpleShows =goodService.findByCateId(cateId);
        return goodSimpleShows;
    }

    //    增加商品信息
    @RequestMapping("/addGood.do")
    public void addGood(HttpServletRequest request) {
        GoodAndPic good = null;
        String goodName, goodBrand, goodDescribe;
        Integer catId;
        goodName = request.getParameter("goodName");
        goodBrand = request.getParameter("goodBrand");
        catId = Integer.valueOf(request.getParameter("catId"));
        goodDescribe = request.getParameter("goodDescribe");
        good.setGoodName(goodName);
        good.setCatId(catId);
        good.setGoodBrand(goodBrand);
        good.setGoodDescribe(goodDescribe);
        goodService.insertGood(good);
    }

    //   删除商品信息
    @RequestMapping("/deleteGood.do")
    @ResponseBody
    public void deleteGood(int goodId) {
        goodService.deleteGood(goodId);
    }

    //展示商品列表
    @RequestMapping("/showGoodList.do")
    @ResponseBody
    public GoodPages showGoodList(
            @RequestParam(value = "page", defaultValue = "1") int pageNum,
            @RequestParam(value = "limit", defaultValue = "5") int limit,
            @RequestParam(value = "goodName", defaultValue = "") String goodName) {
        List<GoodCatSku> goodCatSkus;
        Good good = new Good();
        good.setGoodName(goodName);
        //pageNum:起始页面  pageSize:每页的大小
        PageHelper.startPage(pageNum, limit);
        //查找条件，一定要紧跟在startPage后
        goodCatSkus = goodService.findAllSelective(good);
        PageInfo pageResult = new PageInfo(goodCatSkus);
        //设置前台需要的数据
        GoodPages goodPages = new GoodPages();
        goodPages.setCode(0);
        goodPages.setMsg("");
        goodPages.setCount((int) pageResult.getTotal());
        goodPages.setData(pageResult.getList());
        return goodPages;
    }

    //    改变商品状态（上架/下架）
    @RequestMapping("/changeGoodState.do")
    @ResponseBody
    public Map<String, String> changeGoodState(int goodId,boolean goodState){
        Map<String,String> map = new HashMap<>();
        int state;
        try {
            state = goodService.updateStateById(goodId,goodState);
        }
        catch (CustomException ce){
            map.put("status","500");
            map.put("msg",ce.getMessage());
            return map;
        }
        map.put("status","200");
        if (state==0){
            map.put("msg","商品下架成功");
        }
        else{
            map.put("msg","商品上架成功");
        }
        return map;
    }

    @RequestMapping("/showGoodEditMsg.do")
    public String showGoodEditMsg(HttpServletRequest request){
        return "admin/good-edit.jsp";
    }

    @RequestMapping("/goodEditPage.do")
    public String goodEditPage(Model model){
        List<Category> categories = categoryService.findPreCate();
        model.addAttribute("firstCategory",categories);
        return "admin/good-add.jsp";
    }

    @RequestMapping("/saveGood.do")
    @ResponseBody
    private String saveGood(Good good, HttpServletRequest request, String imgUrls){
        Map<String,String> map = new HashMap<>();
        String str = request.getParameter("goodSkus");
        List<GoodSku> goodSkus= JSONArray.parseArray(str,GoodSku.class);
        String[] urls = imgUrls.split(",");
        String goodProp = good.getGoodProps();
        int a = goodProp.indexOf(",")+1;
        String goodProps = goodProp.substring(a);
        good.setGoodProps(goodProps);
        int size = goodSkus.size();
        if(size==0){
            good.setGoodState(false);
        }
        else{
            int stock=0;
            for(int j = 0 ;j<size;j++){
                stock+=goodSkus.get(j).getSkuStock();
            }
            if (stock<=0){
                good.setGoodState(false);
            }
            else
                good.setGoodState(true);
        }
        int goodId = goodService.insertGoodReturnId(good);
        String pic=good.getGoodImage();
        for (GoodSku gs:goodSkus){
            gs.setGoodId(goodId);
            gs.setSkuPic(pic);
            if (gs.getSkuStock()>0)
                gs.setSkuState(true);
            else
                gs.setSkuState(false);
            goodSkuService.insertGoodSku(gs);
        }
        GoodPic goodPic = new GoodPic();
        for (int i = 0; i < urls.length; i++) {
//            urls[i];
            goodPic.setPicName(urls[i]);
            goodPic.setGoodId(goodId);
            goodPic.setIsTurn(true);
            goodPic.setPicOrder(i);
            goodPicService.insertGoodPic(goodPic);
        }
        return "1";
    }

//    商品详情页信息展示
    @RequestMapping("/toGoodDetailPage.do")
    public String toGoodDetailPage(int goodId,HttpServletRequest request){
        GoodShowPage goodSimpleShow=goodService.findById(goodId);
        return "customer/single-product.jsp";
    }
}
