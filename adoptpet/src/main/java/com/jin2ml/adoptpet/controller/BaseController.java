package com.jin2ml.adoptpet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseController
{  
    @RequestMapping("hello")
    public ModelAndView handleRequest() throws Exception
    {
        ModelAndView view = new ModelAndView("hello","name","000");
        view.addObject("heihei", "heihei");
        view.getModel().put("names", "names");
        System.out.println("hello world");
       return view;
    }

}
