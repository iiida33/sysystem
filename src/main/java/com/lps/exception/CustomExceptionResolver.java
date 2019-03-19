package com.lps.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: CustomExceptionResolver
 * @Description: 自定义异常处理器
 * @Author: 梁培珊
 * @Date: 14:13 2019/3/17
 **/
public class CustomExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse,
                                         Object o, Exception e) {
        CustomException customException = null;
        if (e instanceof CustomException) {
            customException = (CustomException) e;
        }else{
            customException = new CustomException("系统出现未知错误!");
        }

        String message = customException.getMessage();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message",message);
        modelAndView.setViewName("error/error.jsp");

        return modelAndView;
    }
}
