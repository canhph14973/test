package com.example.demo_datn_ganime.controller;

import com.example.demo_datn_ganime.entity.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo_datn_ganime.serviceImp.brandServiceImp;

import java.util.List;

@Controller
@RequestMapping("/ganime/brand")
public class brandController {
    @Autowired
    brandServiceImp brandServiceImp;

    @GetMapping("/listBrand")
    public String listBrand(Model model){
        List<Brand> brand=brandServiceImp.findAll();
        model.addAttribute("brand",brand);
        return "brand/listBrand";
    }

}
