package com.tucan.Personal.Model;

import com.tucan.Personal.Model.Enum.Estado;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "asistencia")
public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asistencia")
    private int id;
    @Column(nullable = false)
    private LocalDate fecha = LocalDate.now();

    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Estado estado;



}
