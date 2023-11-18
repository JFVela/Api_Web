package com.api.ong.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "voluntario")
public class Voluntario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dni")
    private Integer dni;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "paterno")
    private String paterno;
    @Column(name = "materno")
    private String materno;
    @Column(name = "correo")
    private String correo;
    @Column(name = "telefono")
    private int telefono;
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "provincia")
    private String provincia;
    @Column(name = "distrito")
    private String distrito;
    @OneToMany(mappedBy = "voluntario")
    private List<Inscripcion> listaInscripcion;
    @ManyToOne
    @JoinColumn(name = "Especialidades_idEspecialidades")
    private Especialidades especialidad;


}