package com.tucan.Personal.Interface;

import com.tucan.Personal.Model.Fincas;

import java.util.List;
import java.util.Optional;

public interface interfaceFinca {
    public List<Fincas> listFincas();
    public void guardar(Fincas fincas);
    public Optional<Fincas> editar(int id);
    public void eliminar(int id);
}
