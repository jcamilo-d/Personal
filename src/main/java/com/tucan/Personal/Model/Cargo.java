package com.tucan.Personal.Model;

import com.tucan.Personal.Model.Enum.Clasificacion;
import jakarta.persistence.*;
import lombok.Data;


import java.sql.Timestamp;

@Data
@Entity
@Table(name = "cargo")
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cargo")
    private int id;
    @Column(length = 100, nullable = false)
    private String nombre;
    @Enumerated(EnumType.STRING)
    private Clasificacion clasificacion;
    @ManyToOne
    @JoinColumn(name = "area_id")
    private Area area;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String descripcion;

}
