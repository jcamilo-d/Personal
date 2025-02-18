package com.tucan.Personal.Service;

import com.tucan.Personal.Interface.interfaceEps;
import com.tucan.Personal.Model.Eps;
import com.tucan.Personal.Repository.repEps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class serviceEps implements interfaceEps {
    @Autowired
    private repEps repositorio;

    @Override
    public List<Eps> listEps() {
        return repositorio.findAll();
    }

    @Override
    public void guardar(Eps eps) {
        repositorio.save(eps);
    }

    @Override
    public Optional<Eps> editar(int id) {
        return repositorio.findById(id);
    }

    @Override
    public void eliminar(int id) {
        repositorio.deleteById(id);
    }
}
