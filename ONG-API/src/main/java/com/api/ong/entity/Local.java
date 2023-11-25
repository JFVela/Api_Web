package com.api.ong.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="local_donacion")
public class Local {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Getter @Setter
	@Column(name="id_local")
	private Integer id_local;
	@Column(name="nombre")
	private String nombre;
	@Column(name="direccion")
	private String direccion;
}
