package com.tucan.Personal.Controller;

import com.tucan.Personal.Interface.interfaceBarrio;
import com.tucan.Personal.Interface.interfaceMunicipio;
import com.tucan.Personal.Model.Barrio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class ControllerBarrio {
    @Autowired
    private interfaceBarrio service;

    @Autowired
    private interfaceMunicipio municipio;


@GetMapping("/barrios")
    public String listarBarrios(Model model){
    model.addAttribute("titulo","ver Barrios");
    model.addAttribute("cuerpo","BARRIOS");
    model.addAttribute("listaBarrios",service.listBarrios());
    return "/barrios";
}

@GetMapping("/barrios/nuevo")
    public String formularioBarrio(Model model){
    model.addAttribute("titulo","ingresar nuevoBarrio");
    model.addAttribute("cuerpo","Registro de Barrios");
    model.addAttribute("barrio", new Barrio());
    model.addAttribute("listaMunicipios",municipio.listMunicipios());
    return "/barriosNuevo";
}

@PostMapping("/barrios/guardar")
    public String guardarBarrio(@ModelAttribute Barrio barrio){
    service.guardar(barrio);
    return "redirect:/barrios";
}

@GetMapping("/barrios/editar/{id}")
    public String editarBarrio(@PathVariable("id")int id, Model model){
    model.addAttribute("barrio",service.editar(id));
    model.addAttribute("listaMunicipios",municipio.listMunicipios());
    return "/barriosNuevo";
}

@GetMapping("barrios/eliminar/{id}")
    public String eliminarBarrio(@PathVariable("id")int id){
    service.eliminar(id);
    return "redirect:/barrios";
}



}
