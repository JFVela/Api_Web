package com.api.ong.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "empleados")
public class empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private Integer codigo;
	@Column(name = "dni")
	private Integer dni;
	@Column(name = "login")
	private String login;
	@Column(name = "contraseña")
	private String contraseña;

	@Column(name = "nombre")
	private String nombre;
	@Column(name = "paterno")
	private String paterno;
	@Column(name = "materno")
	private String materno;
	
	@Column(name = "telefono")
	private Integer telefono;
	@Column(name = "correo")
	private String correo;
	@Column(name = "direccion")
	private String direccion;
	@Column(name = "sueldo")
	private Integer sueldo;
	@Column(name = "salt")
	private byte[] salt;
	@ManyToOne
	@JoinColumn(name = "id_depa")
	private departamento depa;
}
