package com.api.ong.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="donantes")
@Data
@NoArgsConstructor
public class Donante {
	@Id
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
	/*//FORANEA
	@OneToMany
	@JoinColumn(name = "idONG")
	private Ren_vida ong;*/
}
