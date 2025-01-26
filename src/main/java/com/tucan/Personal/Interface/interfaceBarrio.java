package com.tucan.Personal.Interface;

import com.tucan.Personal.Model.Barrio;

import java.util.List;
import java.util.Optional;

public interface interfaceBarrio {
    public List<Barrio> listBarrios();
    public void guardar (Barrio barrio);
    public Optional<Barrio> editar(int id);
    public void eliminar(int id);
}
