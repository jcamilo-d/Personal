package com.tucan.Personal.Service;

import com.tucan.Personal.Interface.interfaceBarrio;
import com.tucan.Personal.Model.Barrio;
import com.tucan.Personal.Repository.repBarrio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class serviceBarrio implements interfaceBarrio {
    @Autowired
    private repBarrio repositorio;
    @Override
    public List<Barrio> listBarrios() {
        return repositorio.findAll();
    }

    @Override
    public void guardar(Barrio barrio) {
        repositorio.save(barrio);
    }

    @Override
    public Optional<Barrio> editar(int id) {
        return repositorio.findById(id);
    }

    @Override
    public void eliminar(int id) {
        repositorio.deleteById(id);
    }
}
