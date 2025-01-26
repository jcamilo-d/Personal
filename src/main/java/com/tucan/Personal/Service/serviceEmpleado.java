package com.tucan.Personal.Service;

import com.tucan.Personal.Interface.interfaceEmpleado;
import com.tucan.Personal.Model.Empleado;
import com.tucan.Personal.Repository.repEmpleado;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class serviceEmpleado implements interfaceEmpleado {
    @Autowired
    private repEmpleado repositorio;
    @Override
    public List<Empleado> listEmpleados() {
        return repositorio.findAll();
    }

    @Override
    public void guardar(Empleado empleado) {
        repositorio.save(empleado);
    }

    @Override
    public Optional<Empleado> editar(int id) {
        return repositorio.findById(id);
    }

    @Override
    public void eliminar(int id) {
        repositorio.deleteById(id);
    }
}
