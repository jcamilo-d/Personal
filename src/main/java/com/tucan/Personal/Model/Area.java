package com.tucan.Personal.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "area")
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_area")
    private int id;
    @Column(length = 30, nullable = false)
    private String nombre;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String descripcion;

}
