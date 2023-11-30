package com.api.ong.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@Entity
@Data
@NoArgsConstructor                                                
public class Voluntario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer dni;
    public String nombre;
    public  String paterno;
    public  String materno;
    public  String correo;
    public  int telefono;
    public  String ciudad;
    public  String provincia;
    public  String distrito;
    @OneToMany(mappedBy = "voluntario")
    @JsonIgnore
    public  List<Inscripcion> listaInscripcion;
    @ManyToOne
    @JoinColumn(name = "id_Especialidades")
    public  Especialidades especialidad;
    
	@ManyToOne
	@JoinColumn(name = "idONG")
	public OngEmpresa ong;


}