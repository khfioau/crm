package com.bjpowernode.crm.settings.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WorkToSetting {

    @RequestMapping("/settings/index")
    public String workToSetting(){
        return "settings/index";
    }


}
