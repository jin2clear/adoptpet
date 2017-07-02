package com.jin2ml.adoptpet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseController
{  
    @RequestMapping(name="hello",method=RequestMethod.GET)
    public String sayHello()
    {
        ModelAndView view = new ModelAndView("hello");
        view.addObject("name", "111");
        System.out.println("hello world");
       return "hello";
    }

}
