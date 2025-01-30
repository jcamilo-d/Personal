package com.tucan.Personal.Service;

import com.tucan.Personal.Interface.interfaceArea;
import com.tucan.Personal.Model.Area;
import com.tucan.Personal.Repository.repArea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class serviceArea implements interfaceArea {
    @Autowired
    private repArea repositorio;
    @Override
    public List<Area> listaAreas() {
        return repositorio.findAll();
    }

    @Override
    public void guardar(Area area) {
        repositorio.save(area);
    }

    @Override
    public Optional<Area> editar(int id) {
        return repositorio.findById(id);
    }

    @Override
    public void eliminar(int id) {
        repositorio.deleteById(id);
    }
}
