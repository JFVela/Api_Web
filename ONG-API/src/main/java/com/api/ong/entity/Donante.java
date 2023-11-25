package com.api.ong.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="donantes")
public class Donante {
	@Id
	@Getter @Setter
	@Column(name = "dni")
	private Integer dni;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "paterno")
	private String paterno;
	@Column(name = "materno")
	private String materno;
	@Column(name = "celular")
	private int celular;
	@Column(name = "email")
	private String email;
	@Column(name = "distrito")
	private String distrito;
	@Column(name = "direccion")
	private String direccion;
	public Integer getDni() {
		return dni;
	}
	/*//FORANEA
	@OneToMany
	@JoinColumn(name = "idONG")
	private Ren_vida ong;*/
}
