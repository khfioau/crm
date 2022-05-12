package com.bjpowernode.crm.settings.web.controller;

import com.bjpowernode.crm.settings.domain.Value;
import com.bjpowernode.crm.settings.mapper.ValueMapper;
import com.bjpowernode.crm.settings.service.ValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/value")
public class DictionaryValue {

    @Autowired
    private ValueService valueService;

    @RequestMapping("/selectAll")
    public String selectAll(Model model){
        List<Value> list = valueService.selectAll();
        model.addAttribute("valuelist",list);
        return "settings/dictionary/value/index";
    }
}
