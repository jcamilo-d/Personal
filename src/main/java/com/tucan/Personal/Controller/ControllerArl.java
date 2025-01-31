package com.tucan.Personal.Controller;

import com.tucan.Personal.Interface.interfaceArl;
import com.tucan.Personal.Model.Arl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class ControllerArl {

    @Autowired
    private interfaceArl service;

@GetMapping("/arl")
    public String listarArl(Model model){
    model.addAttribute("titulo","ver Arl");
    model.addAttribute("cuerpo","ARL");
    model.addAttribute("listaArl",service.listArl());
    return "/arl";
}

@GetMapping("/arl/nuevo")
    public String formularioArl(Model model){
    model.addAttribute("titulo","Ingresar NuevoArl");
    model.addAttribute("cuerpo","Registro de ARL");
    model.addAttribute("arl",new Arl());
    return "/arlNuevo";
}

@PostMapping("/arl/guardar")
    public String guardarArl(@ModelAttribute Arl arl){
    service.guardar(arl);
    return "redirect:/arl";
}

@GetMapping("/arl/editar/{id}")
    public String editarArl(@PathVariable("id") int id, Model model){
    model.addAttribute("arl",service.editar(id));
    return "/arlNuevo";
}

@GetMapping("/arl/eliminar/{id}")
    public String eliminarArl(@PathVariable("id") int id, Model model){
    service.eliminar(id);
    return "redirect:/arl";
}

}
