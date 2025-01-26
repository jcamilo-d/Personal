package com.tucan.Personal.Interface;

import com.tucan.Personal.Model.Eps;

import java.util.List;
import java.util.Optional;

public interface interfaceEps {
    public List<Eps> listEps();
    public void guardar(Eps eps);
    public Optional<Eps> editar(int id);
    public void eliminar(int id);
}
