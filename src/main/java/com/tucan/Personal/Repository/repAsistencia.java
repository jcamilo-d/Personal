package com.tucan.Personal.Repository;

import com.tucan.Personal.Model.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repAsistencia extends JpaRepository<Asistencia,Integer> {
}
