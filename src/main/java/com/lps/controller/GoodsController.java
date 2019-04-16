package com.lps.controller;

import com.alibaba.fastjson.JSONArray;
import com.lps.po.Good;
import com.lps.po.GoodSku;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class GoodsController {

	@ResponseBody
	@RequestMapping(value="saveGoods.do",method=RequestMethod.POST)
	private String saveImgInfo(Good good, HttpServletRequest request, String imgUrls){
		String str = request.getParameter("goodSkus");
		List<GoodSku> goodSkus= JSONArray.parseArray(str,GoodSku.class);
		System.out.println(goodSkus);
		System.out.println(good);
		System.out.println(imgUrls);
		String[] urls = imgUrls.split(",");
		for (int i = 0; i < urls.length; i++) {
			System.out.println("图片名称："+urls[i]);
		}
		return "1";
	}
}
