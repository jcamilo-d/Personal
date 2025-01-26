package com.tucan.Personal.Service;

import com.tucan.Personal.Interface.interfaceCargo;
import com.tucan.Personal.Model.Cargo;
import com.tucan.Personal.Repository.repCargo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class serviceCargo implements interfaceCargo {
    @Autowired
    private repCargo repositorio;
    @Override
    public List<Cargo> listCargos() {
        return repositorio.findAll();
    }

    @Override
    public void guardar(Cargo cargo) {
        repositorio.save(cargo);
    }

    @Override
    public Optional<Cargo> editar(int id) {
        return repositorio.findById(id);
    }

    @Override
    public void eliminar(int id) {
        repositorio.deleteById(id);
    }
}
