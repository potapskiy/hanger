package com.hanger.servlets;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by b.potapskiy on 03.02.15.
 */
@Controller
@RequestMapping("test")
public class HelloWorldServlet {


    @RequestMapping("hello")
    public String getHello() {

        return "{\"msg\": \"ok\"}";

    }




}