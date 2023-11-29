package com.api.ong.entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
public class Eventos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_evento;
    private String nombre;
	private String ubicacion;
	@Temporal(TemporalType.DATE)
	private Date inicio_inscripcion;
	@Temporal(TemporalType.DATE)
	private Date final_inscripcion;
	@Temporal(TemporalType.DATE)
	private Date inicio;
	@Temporal(TemporalType.DATE)
	private Date finalE;
	private String detalle;
	private Integer vacantes;
	@OneToMany(mappedBy = "eventos")
	@JsonIgnore
	private List<Inscripcion> listaInscripcion;
}

