package com.tucan.Personal.Service;

import com.tucan.Personal.Interface.interfaceAsistencia;
import com.tucan.Personal.Model.Asistencia;
import com.tucan.Personal.Repository.repAsistencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class serviceAsistencia implements interfaceAsistencia {
    @Autowired
    private repAsistencia repositorio;
    @Override
    public List<Asistencia> listAsistencia() {
        return repositorio.findAll();
    }

    @Override
    public void guardar(Asistencia asistencia) {
        repositorio.save(asistencia);
    }

    @Override
    public Optional<Asistencia> editar(int id) {
        return repositorio.findById(id);
    }
    @Override
    public void elimnar(int id) {
        repositorio.deleteById(id);
    }
}
