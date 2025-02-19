package com.tucan.Personal.Controller;

import com.tucan.Personal.Interface.interfaceMunicipio;
import com.tucan.Personal.Model.Municipio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class ControllerMunicipio {

    @Autowired
    private interfaceMunicipio service;

@GetMapping("/municipios")
    public String listarMunicipios(Model model){
    model.addAttribute("titulo","verMunicipios");
    model.addAttribute("cuerpo","MUNICIPIOS");
    model.addAttribute("listaMunicipios",service.listMunicipios());
    return "/municipios";
}

@GetMapping("/municipios/nuevo")
    public String formularioMunicipio(Model model){
    model.addAttribute("titulo","ingresar nuevoMunicipio");
    model.addAttribute("cuerpo","Registro de Municipios");
    model.addAttribute("municipio",new Municipio());
    return "/municipiosNuevo";
}

@PostMapping("/municipios/guardar")
    public String guardarMunicipio(@ModelAttribute Municipio municipio){
    service.guardar(municipio);
    return "redirect:/municipios";
}

@GetMapping("municipios/editar/{id}")
    public String editarMunicipio(@PathVariable("id") int id, Model model){
    model.addAttribute("municipio",service.editar(id));
    return "/municipiosNuevo";
}

@GetMapping("/municipios/eliminar/{id}")
    public String eliminarMunicipio(@PathVariable("id")int id){
    service.eliminar(id);
    return "redirect:/municipios";
}


}
