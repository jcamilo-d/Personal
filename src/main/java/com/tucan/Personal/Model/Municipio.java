package com.tucan.Personal.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "municio")

public class Municipio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cargo")
    private int id;
    @Column(length = 100, nullable = false)
    private String nombre;
    @Column(length = 5, nullable = false)
    private String codigo;

}
