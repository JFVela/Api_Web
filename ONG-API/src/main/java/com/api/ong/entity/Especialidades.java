package com.api.ong.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor                                                
public class Especialidades {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Especialidades;
	private String nombre;
	/*@OneToMany(mappedBy ="especialidad")
	@Getter 
	@Setter
	private List<Voluntario> listaVoluntario;*/
}

