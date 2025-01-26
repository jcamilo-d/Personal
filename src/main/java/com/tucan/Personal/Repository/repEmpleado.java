package com.tucan.Personal.Repository;

import com.tucan.Personal.Model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repEmpleado extends JpaRepository<Empleado,Integer> {
}
