package com.api.ong.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Entity
@Data
@NoArgsConstructor                                                
public class Especialidades {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Especialidades;
	private String nombre;
	@OneToMany(mappedBy ="especialidad")
	@JsonIgnore
	private List<Voluntario> listaVoluntario;
}

