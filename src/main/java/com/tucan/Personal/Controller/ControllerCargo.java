package com.tucan.Personal.Controller;

import com.tucan.Personal.Interface.interfaceArea;
import com.tucan.Personal.Interface.interfaceCargo;
import com.tucan.Personal.Model.Cargo;
import com.tucan.Personal.Model.Enum.Clasificacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class ControllerCargo {
    @Autowired
    private interfaceCargo service;
    @Autowired
    private interfaceArea area;


@GetMapping("/cargos")
    public String listarCargos(Model model){
    model.addAttribute("titulo", "ver Cargos");
    model.addAttribute("cuerpo", "CARGOS");
    model.addAttribute("listaCargos",service.listCargos());
    return "/cargos";
}

@GetMapping("/cargos/nuevo")
    public String formularioCargo(Model model){
    model.addAttribute("titulo", "ingresar NuevoCargo");
    model.addAttribute("titulo", "Registro de Cargos");
    model.addAttribute("cargo", new Cargo());
    model.addAttribute("clasificacion", Clasificacion.values());
    model.addAttribute("listaAreas",area.listaAreas());
    return "/cargosNuevo";
}

@PostMapping("/cargos/guardar")
    public String guardarCargo(@ModelAttribute Cargo cargo){
    service.guardar(cargo);
    return "redirect:/cargos";
}

@GetMapping("/cargos/editar/{id}")
    public String editarCargo(@PathVariable("id") int id, Model model){
    model.addAttribute("cargo", service.editar(id));
    return "/cargosNuevo";
}

@GetMapping("/cargos/eliminar/{id}")
    public String eliminarCargo(@PathVariable("id") int id, Model model){
    service.eliminar(id);
    return "redirect:/cargos";
}


}
