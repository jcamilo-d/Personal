package com.tucan.Personal.Interface;

import com.tucan.Personal.Model.Empleado;

import java.util.List;
import java.util.Optional;

public interface interfaceEmpleado {
    public List<Empleado> listEmpleados();
    public void guardar(Empleado empleado);
    public Optional<Empleado> editar (int id);
    public void eliminar(int id);

}
