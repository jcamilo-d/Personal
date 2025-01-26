package com.tucan.Personal.Interface;

import com.tucan.Personal.Model.Arl;

import java.util.List;
import java.util.Optional;

public interface interfaceArl {
    public List<Arl> listArl();
    public void guardar(Arl arl);
    public Optional<Arl> editar(int id);
    public void eliminar(int id);
}
