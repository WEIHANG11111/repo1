package com.wyh.demo.web;

import com.wyh.demo.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        //System.out.println("----------index---------");
        return "index";
    }

    @GetMapping("/index_v")
    public String index1(){
        return "admin/index";
    }

    @GetMapping("/login_v")
    public String login(){
        return "admin/login";
    }
}
