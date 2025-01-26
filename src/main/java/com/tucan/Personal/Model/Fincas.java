package com.tucan.Personal.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "finca")
public class Fincas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_finca")
    private int id;
    @Column(length = 30, nullable = false)
    private String nombre;
    @Column(length = 3, nullable = false, unique = true)
    private String codigo;

}
