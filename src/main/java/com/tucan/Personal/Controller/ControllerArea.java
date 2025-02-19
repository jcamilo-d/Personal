package com.tucan.Personal.Controller;

import com.tucan.Personal.Interface.interfaceArea;
import com.tucan.Personal.Model.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class ControllerArea {
    @Autowired
    private interfaceArea service;
@GetMapping("/areas")
    public String listarAreas(Model model){
        model.addAttribute("titulo","verAreas");
        model.addAttribute("cuerpo","AREAS");
        model.addAttribute("listaAreas",service.listaAreas());
        return"/areas";
    }
@GetMapping("/areas/nuevo")
    public String formularioArea(Model model){
    model.addAttribute("titulo","Ingresar NuevaArea");
    model.addAttribute("cuerpo","Registro de Areas");
    model.addAttribute("area",new Area());
    return "/areasNuevo";
    }
@PostMapping("/areas/guardar")
    public String guardarArea(@ModelAttribute Area area){
        service.guardar(area);
    return "redirect:/areas";
    }
@GetMapping("/areas/editar/{id}")
    public String editarArea(@PathVariable("id") int id, Model model){
    model.addAttribute("area",service.editar(id));
    return"/areasNuevo";
    }
@GetMapping("/areas/eliminar/{id}")
    public String eliminarArea(@PathVariable("id") int id, Model model){
    service.eliminar(id);
    return "redirect:/areas";
    }
}
