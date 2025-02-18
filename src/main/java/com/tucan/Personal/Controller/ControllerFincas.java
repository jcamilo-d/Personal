package com.tucan.Personal.Controller;

import com.tucan.Personal.Interface.interfaceFinca;
import com.tucan.Personal.Model.Fincas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class ControllerFincas{
    @Autowired
    private interfaceFinca service;

@GetMapping("/fincas")
    public String listarFincas(Model model){
    model.addAttribute("titulo","verFincas");
    model.addAttribute("cuerpo","FINCAS");
    model.addAttribute("litaFincas",service.listFincas());
    return "/fincas";
}

@GetMapping("/fincas/nuevo")
    public String formularioFinca(Model model){
    model.addAttribute("titulo","Ingresar nuevaFinca");
    model.addAttribute("cuerpo","Registro de Fincas");
    model.addAttribute("finca", new Fincas());
    return "/fincasNuevo";
}

@PostMapping("/fincas/guardar")
    public String guardarFinca(@ModelAttribute Fincas fincas){
    service.guardar(fincas);
    return "redirect:/fincas";
}

@GetMapping("fincas/editar/{id}")
    public String editarFinca(@PathVariable("id") int id, Model model){
    model.addAttribute("finca",service.editar(id));
    return "/fincasNuevo";
}

@GetMapping("fincas/eliminar/{id}")
    public String eliminarFinca(@PathVariable("id")int id){
    service.eliminar(id);
    return "redirect:/fincas";
}

}
