package com.api.ong.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="local_donacion")
@Data
@NoArgsConstructor
public class Local {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_local")
	private Integer id_local;
	@Column(name="nombre")
	private String nombre;
	@Column(name="direccion")
	private String direccion;
}
