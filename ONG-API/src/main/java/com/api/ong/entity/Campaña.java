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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Table(name="campaña")
@Data
public class Campaña {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_campaña")
	private Integer codigo;
	@Column(name="nombre")
	private String nombre;
	@Column(name="descripcion")
	private String descripcion;
	//PK(relacion)
	@OneToMany(mappedBy = "campaña")
	@JsonIgnore
	private List<DonacionVirtual> listaDonacionV;
		
}

