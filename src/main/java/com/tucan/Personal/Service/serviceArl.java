package com.tucan.Personal.Service;

import com.tucan.Personal.Interface.interfaceArl;
import com.tucan.Personal.Model.Arl;
import com.tucan.Personal.Repository.repArl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class serviceArl implements interfaceArl {
    @Autowired
    private repArl repositorio;
    @Override
    public List<Arl> listArl() {
        return repositorio.findAll();
    }

    @Override
    public void guardar(Arl arl) {
        repositorio.save(arl);
    }

    @Override
    public Optional<Arl> editar(int id) {
        return repositorio.findById(id);
    }

    @Override
    public void eliminar(int id) {
        repositorio.deleteById(id);
    }
}
