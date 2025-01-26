package com.tucan.Personal.Interface;

import com.tucan.Personal.Model.Asistencia;

import java.util.List;
import java.util.Optional;

public interface interfaceAsistencia {
    public List<Asistencia> listAsistencia();
    public void guardar(Asistencia asistencia);
    public Optional<Asistencia> editar(int id);
    public void elimnar(int id);
}
