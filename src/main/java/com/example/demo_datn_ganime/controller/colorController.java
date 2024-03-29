package com.example.demo_datn_ganime.controller;

import com.example.demo_datn_ganime.entity.Brand;
import com.example.demo_datn_ganime.entity.Color;
import com.example.demo_datn_ganime.serviceImp.colorServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/ganime/color")
public class colorController {
    @Autowired
   colorServiceImp colorServiceImp;

    @GetMapping("/listColor")
    public String listBrand(Model model){
        List<Color> color=colorServiceImp.findAll();
        model.addAttribute("color",color);
        return "color/listColor";
    }

}
