package com.api.ong.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.api.ong.entity.DonacionVirtual;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="moneda")
@Data
public class Moneda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_moneda")
	private Integer codigo;
	@Column(name="nombre")
	private String nombre;
	@Column(name="valor")
	private Double valor;
	//PK(relacion)
	@OneToMany(mappedBy = "moneda")
	@JsonIgnore
	private List<DonacionVirtual> listaDonacionV;
		
}
