package com.example.demo_datn_ganime.controller;

import com.example.demo_datn_ganime.entity.Material;
import com.example.demo_datn_ganime.serviceImp.materialServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/ganime/material")
public class materialController {
    @Autowired
    materialServiceImp materialServiceImp;

    @GetMapping("/listMaterial")
    public String listMaterial(Model model){
        List<Material> material=materialServiceImp.findAll();
        model.addAttribute("material",material);
        return "material/listMaterial";
    }
}
