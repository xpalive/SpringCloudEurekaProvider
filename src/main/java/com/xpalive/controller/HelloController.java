package com.xpalive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiongp on 2017/9/7.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/world")
    @ResponseBody
    public String world(){
        return "hello world 8762";
    }
}
