package com.tucan.Personal.Service;

import com.tucan.Personal.Interface.interfaceFinca;
import com.tucan.Personal.Model.Fincas;
import com.tucan.Personal.Repository.repFincas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class serviceFincas implements interfaceFinca {
    @Autowired
    private repFincas repositorio;
    @Override
    public List<Fincas> listFincas() {
        return repositorio.findAll() ;
    }

    @Override
    public void guardar(Fincas fincas) {
        repositorio.save(fincas);
    }

    @Override
    public Optional<Fincas> editar(int id) {
        return repositorio.findById(id);
    }

    @Override
    public void eliminar(int id) {
        repositorio.deleteById(id);
    }
}
