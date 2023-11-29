package com.api.ong.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "empleados")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	public Integer codigo;
	@Column(name = "dni")
	public Integer dni;
	@Column(name = "login")
	public String login;
	@Column(name = "contraseña")
	public String contraseña;

	@Column(name = "nombre")
	public String nombre;
	@Column(name = "paterno")
	public String paterno;
	@Column(name = "materno")
	public String materno;

	@Column(name = "telefono")
	public Integer telefono;
	@Column(name = "correo")
	public String correo;
	@Column(name = "direccion")
	public String direccion;
	@Column(name = "sueldo")
	public Integer sueldo;
	@Column(name = "salt")
	public byte[] salt;
	@ManyToOne
	@JoinColumn(name = "id_depa")
	public Departamento depa;
	@ManyToOne
	@JoinColumn(name = "id_rol")
	public Rol rol;
	
}
