package com.bjpowernode.crm.settings.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Dictionary {

    @RequestMapping("/dictionary/index")
    public String toDictionary(){
        return "settings/dictionary/index";
    }

}
