package com.tucan.Personal.Interface;

import com.tucan.Personal.Model.Municipio;

import java.util.List;
import java.util.Optional;

public interface interfaceMunicipio {
    public List<Municipio> listMunicipios();
    public void guardar(Municipio municipio);
    public Optional<Municipio> editar(int id);
    public void eliminar(int id);
}
