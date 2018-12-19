package com.zttc.itat.jsp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * @url： http://127.0.0.1:8080/jspIndex
 * Create Time:  2018-12-17 下午 12:19
 */
@Controller
public class JspController {


    @RequestMapping("/jspIndex")
    public ModelAndView jspIndex(){
        ModelAndView model = new ModelAndView();
        model.addObject("username","混沌");
        model.addObject("nickname","盘古");
        model.setViewName("jspIndex");
        return model;
    }

}
