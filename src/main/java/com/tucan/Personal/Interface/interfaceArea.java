package com.tucan.Personal.Interface;

import com.tucan.Personal.Model.Area;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface interfaceArea {
    public List<Area> listaAreas();
    public void guardar(Area area);
    public Optional<Area> editar(int id);
    public void eliminar(int id);
}
