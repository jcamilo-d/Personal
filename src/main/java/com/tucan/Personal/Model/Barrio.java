package com.tucan.Personal.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "barrios")
public class Barrio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_barrios", nullable = false)
    private int id;
    @Column(length = 150, nullable = false)
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "barrio_id")
    private Municipio municipio;

}
