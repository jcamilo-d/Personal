package com.tucan.Personal.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Eps")
public class Eps {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Eps")
    private int id;
    @Column(length = 100, nullable = false)
    private String nombre;
    private String contacto;

}
