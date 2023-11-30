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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "ong")
public class OngEmpresa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ong")
	private Integer id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "mision")
	private String mision;

	@Column(name = "ubicacion")
	private String ubicacion;

	@Column(name = "año")
	private Integer año;

	@Column(name = "tipo_organización")
	private String tipo;

	@Column(name = "financiamiento")
	private String financiamiento;
	
	@OneToMany(mappedBy = "ong")
	@JsonIgnore
	private List<Empleado> listaEmple;
}
