package com.api.ong.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="donacion_fisica")
@Data
@NoArgsConstructor
public class DonacionFisica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_fisica")
	private Integer id_fisica;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="estado")
	private Boolean estado;	
	@ManyToOne
	@JoinColumn(name="donantes_dni")
	private Donante donan ;
	@ManyToOne
	@JoinColumn(name="local_donacion_id_local")
	private Local local_don ;
}
