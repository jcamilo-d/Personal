package com.tucan.Personal.Service;

import com.tucan.Personal.Interface.interfaceMunicipio;
import com.tucan.Personal.Model.Municipio;
import com.tucan.Personal.Repository.repMunicipio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class serviceMunicipio implements interfaceMunicipio {
    @Autowired
    private repMunicipio repositorio;
    @Override
    public List<Municipio> listMunicipios() {
        return repositorio.findAll();
    }

    @Override
    public void guardar(Municipio municipio) {
        repositorio.save(municipio);
    }

    @Override
    public Optional<Municipio> editar(int id) {
        return repositorio.findById(id);
    }

    @Override
    public void eliminar(int id) {
        repositorio.deleteById(id);
    }
}
