package com.tucan.Personal.Controller;

import com.tucan.Personal.Interface.interfaceTipoDocumento;
import com.tucan.Personal.Model.TipoDocumento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class ControllerTipoDocumento {
    @Autowired
    private interfaceTipoDocumento service;

@GetMapping("/documentos")
    public String listarTipoDocumentos(Model model){
    model.addAttribute("titulo","ver TipoDocumentos");
    model.addAttribute("cuerpo","TIPO DE DOCUMENTOS");
    model.addAttribute("listaDocumentos",service.listDocumentos());
    return "/documentos";
}
@GetMapping("/documentos/nuevo")
    public String formularioDocumento(Model model){
    model.addAttribute("titulo","ingresar tipoDocumento");
    model.addAttribute("titulo","Registro tipos de Documentos");
    model.addAttribute("documento",new TipoDocumento());
    return "/documentosNuevo";
}

@PostMapping("/documentos/guardar")
    public String guardarDocumento(@ModelAttribute TipoDocumento tipoDocumento){
    service.guardar(tipoDocumento);
    return "redirect:/documentos";
}

@GetMapping("documentos/editar/{id}")
    public String editarDocumento(@PathVariable("id")int id,Model model){
    model.addAttribute("documento",service.editar(id));
    return "/documentosNuevo";
}

@GetMapping("documentos/eliminar/{id}")
    public String eliminarDocumento(@PathVariable("id")int id){
    service.eliminar(id);
    return "redirect:/documentos";
}

}
