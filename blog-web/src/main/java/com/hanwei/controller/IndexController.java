package com.hanwei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/main")
public class IndexController {

    @RequestMapping(value = "")
    public String index() {
        return "index";
    }
}