package com.tucan.Personal.Model;

import com.tucan.Personal.Model.Enum.Estado;
import com.tucan.Personal.Model.Enum.Genero;
import com.tucan.Personal.Model.Enum.Grupo_Sanguineo;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private int id;
    @Column(length = 200, nullable = false)
    private String nombres;
    @Column(length = 200, nullable = false)
    private String apellidos;
    @ManyToOne
    @JoinColumn(name = "t_documento_id")
    private TipoDocumento tipoDocumento;
    @Column(length = 15, nullable = false, unique = true)
    private String n_documento;
    @Column(nullable = false)
    private LocalDate f_nacimiento;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Genero genero;
    @Enumerated(EnumType.STRING)
    private Grupo_Sanguineo grupo_sanguineo;
    @Column(length = 10, nullable = false)
    private String telefono;
    @Column(length = 10)
    private String t_emergencia; //telefono de contacto de emergenciaa
    private String parentesco;
    @Column(length = 100)
    private String email;
    @ManyToOne
    @JoinColumn(name = "municipio_id")
    private Municipio municipio;
    @ManyToOne
    @JoinColumn(name = "barrio_id")
    private Barrio barrio;
    @Column(length = 150)
    private String direccion;
    @Column(nullable = false)
    private LocalDate f_ingreso;
    @ManyToOne
    @JoinColumn(name = "cargo_id")
    private Cargo cargo;
    @ManyToOne
    @JoinColumn(name = "finca_id")
    private Fincas fincas;
    @ManyToOne
    @JoinColumn(name = "jefe_id")
    private Empleado jefe;
    @ManyToOne
    @JoinColumn(name = "Eps_id")
    private Eps eps;
    @ManyToOne
    @JoinColumn(name = "Arl_id")
    private Arl arl;
    @Enumerated(EnumType.STRING)
    private Estado estado;

    private LocalDate f_salida;









}
