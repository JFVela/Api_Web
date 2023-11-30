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
@Table(name="cuenta")
@Data
public class Cuenta {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="numero")
	private Integer numero;
	@Column(name="dueño")
	private String dueño;
	@Column(name="cvc")
	private Integer cvc;
	@Column(name="mes")
	private Integer mes;
	@Column(name="año")
	private Integer año;
	@Column(name="saldo_actual")
	private Double saldoactual;
	//PK(relacion)
	@OneToMany(mappedBy = "cuenta")
	@JsonIgnore
	private List<DonacionVirtual> listaDonacionV;
	
		
}
