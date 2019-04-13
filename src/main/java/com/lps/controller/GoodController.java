package com.lps.controller;

import com.lps.po.Good;
import com.lps.service.IGoodService;
import com.lps.service.IGoodSkuService;
import com.lps.vo.GoodAndPic;
import com.lps.vo.GoodSimpleShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ClassName: GoodController
 * @Description:
 * @Author: 梁培珊
 * @Date: 8:28 2019/3/17
 **/
@Controller
public class GoodController {
    @Autowired
    private IGoodService goodService;

    //    展示商品信息
    @RequestMapping("/showGoodMes.do")
    @ResponseBody
    public List<Good> showGoodMes() {
        return goodService.fineAll();
    }

    //    按照分类显示商品信息
    @RequestMapping("/showGoodMesByCate.do")
    @ResponseBody
    public List<GoodSimpleShow> showGoodMesByCate(int CateId) {
        return goodService.findByCateId(CateId);
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
    public void deleteGood(int goodId) {
        goodService.deleteGood(goodId);
    }
}
