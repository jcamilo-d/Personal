package com.tucan.Personal.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "tipo_documento")
public class TipoDocumento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_t_documento")
    private int id;
    @Column(name = "nombre_documento",length = 100, nullable = false, unique = true)
    private String nombre;
    @Column(length = 5)
    private String codigo;


}
