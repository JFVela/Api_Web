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
@Table(name="especialidades")
public class Especialidades {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEspecialidades")
	private Integer codigo;
	@Column (name = "nombre")
	private String nombre;
	@OneToMany(mappedBy ="especialidad")
	private List<Voluntario> listaVoluntario;
}
