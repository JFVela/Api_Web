package com.api.ong.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Departamento")
@Data
public class Departamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_depa")
	private Integer id_depa;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "descripcion")
	private String descripcion;
	@OneToMany(mappedBy = "depa")
	@JsonIgnore
	private List<Empleado> listaEmple;
}
