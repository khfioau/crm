package com.bjpowernode.crm.settings.web.controller;

import com.bjpowernode.crm.settings.domain.Type;
import com.bjpowernode.crm.settings.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DictionaryType {

    @Autowired
    private TypeService typeService;

    @RequestMapping("/type/all")
    public String queryAll(Model model){
        List<Type> typelist = typeService.queryAll();

        model.addAttribute("typelist",typelist);
        return "settings/dictionary/type/index";
    }

    @RequestMapping("/toAdd")
    public String toAdd(){

        return "settings/dictionary/type/save";
    }

    @RequestMapping("/type/add")
    public String add(Type type){
        typeService.add(type);
        return "settings/dictionary/type/index";
    }
    @RequestMapping("/toEdit")
    public String toEdit(Type type,Model model){
        Type type1 = typeService.queryID(type);
        model.addAttribute("typelist",type1);
        return "settings/dictionary/type/edit";
    }
    @RequestMapping("/type/edit")
    public String edit(Type type){
        System.out.println(type);
        typeService.edit(type);
        return "redirect:/type/all";
    }
    @RequestMapping("/type/delete")
    public String delete(Type type){
        typeService.delete(type);
        return "redirect:/type/all";
    }
}
