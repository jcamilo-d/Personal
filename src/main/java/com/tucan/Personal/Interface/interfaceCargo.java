package com.tucan.Personal.Interface;

import com.tucan.Personal.Model.Cargo;

import java.util.List;
import java.util.Optional;

public interface interfaceCargo {
    public List<Cargo> listCargos();
    public void guardar(Cargo cargo);
    public Optional<Cargo> editar (int id);
    public void eliminar(int id);
}
