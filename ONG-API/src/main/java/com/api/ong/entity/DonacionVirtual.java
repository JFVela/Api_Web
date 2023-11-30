package com.api.ong.entity;

import com.api.ong.entity.Campaña;
import com.api.ong.entity.Cuenta;
import com.api.ong.entity.Moneda;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="donacion_virtual")
@Data
public class DonacionVirtual {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_Virtual")
	private Integer codigo;
	//Aqui va la columna de Donantes
	@Column(name="donantes_dni")
	private int donantesdni;
	//Fin de la columna Donantes
	//FK
	@ManyToOne
	@JoinColumn(name="campaña_id_campaña")
	private Campaña campaña;//ASOC
	//FK
	@ManyToOne
	@JoinColumn(name="moneda_id_moneda")
	private Moneda moneda;
	@Column(name="monto")
	private Double monto;
	//FK
	@ManyToOne
	@JoinColumn(name="cuenta_numero")
	private Cuenta cuenta;
		
}

