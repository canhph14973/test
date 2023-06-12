package com.example.demo_datn_ganime.controller;

import com.example.demo_datn_ganime.entity.Category;
import com.example.demo_datn_ganime.serviceImp.categoryServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/ganime/category")
public class categoryController {
    @Autowired
    categoryServiceImp categoryServiceImp;
    @GetMapping("/listCategory")
    public String listCategory(Model model){
        List<Category> category=categoryServiceImp.findAll();
        model.addAttribute("category",category);
        return "category/listCategory";
    }
}
