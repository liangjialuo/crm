package com.zking.crm.whg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ser")
public class ServiceConrtooler {

    @RequestMapping("/add")
    public String add() {
        System.out.println("asdasdsad");
        return "service/add";
    }

}
