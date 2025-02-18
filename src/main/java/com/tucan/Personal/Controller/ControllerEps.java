package com.tucan.Personal.Controller;

import com.tucan.Personal.Interface.interfaceEps;
import com.tucan.Personal.Model.Eps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class ControllerEps {
    @Autowired
    private interfaceEps service;

@GetMapping("/Eps")
    public String listaEps (Model model) {
    model.addAttribute("titulo", "ver Eps");
    model.addAttribute("cuerpo", "EPS");
    model.addAttribute("listaEps", service.listEps());
    return "/eps";
}

@GetMapping("Eps/nuevo")
    public String formularioEps (Model model){
    model.addAttribute("titulo", "ingresar nuevaEps");
    model.addAttribute("cuerpo","Registro de EPS");
    model.addAttribute("eps", new Eps());
    return "/epsNuevo";

}

@PostMapping("/Eps/guardar")
    public String guardarEps(@ModelAttribute Eps eps){
    service.guardar(eps);
    return "redirect:/Eps";
}

@GetMapping("/Eps/editar/{id}")
    public String editarEps(@PathVariable("id")int id, Model model){
    model.addAttribute("eps",service.editar(id));
    return "/epsNuevo";
}
@GetMapping("/Eps/eliminar/{id}")
    public String eliminarEps(@PathVariable("id")int id){
    service.eliminar(id);
    return "redirect:/Eps";
}

}
