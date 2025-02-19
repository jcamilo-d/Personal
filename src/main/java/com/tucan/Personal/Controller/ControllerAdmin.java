package com.tucan.Personal.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ControllerAdmin {

    @GetMapping("/")
    public String vistaAdmin(Model model){
        model.addAttribute("titulo","Panel Administrador");
        return "/adminView";
    }
}
