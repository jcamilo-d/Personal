package com.tucan.Personal.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Arl")
public class Arl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Arl")
    private int id;
    @Column(length = 100, nullable = false)
    private String nombre;
    @Column(length = 10)
    private String contacto;


}
