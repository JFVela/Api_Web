package com.api.ong.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name = "eventos")
public class Eventos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_evento")
	private Integer codigo;
	@Column(name = "nombre")
    private String nombre;
	@Column(name = "ubicacion")
	private String ubicacion;
	@Temporal(TemporalType.DATE)
	@Column(name = "inicio_inscripcion")
	private Date inicioInscripcion;
	@Temporal(TemporalType.DATE)
	@Column(name = "final_inscripcion")
	private Date finalInscripcion;
	@Temporal(TemporalType.DATE)
	@Column(name = "inicio")
	private Date inicio;
	@Temporal(TemporalType.DATE)
	@Column(name = "final")
	private Date finalEvento;
	@Column(name = "detalle")
	private String detalle;
	@Column(name = "vacantes")
	private Integer vacantes;
	@OneToMany(mappedBy = "eventos")
	private List<Inscripcion> listaInscripcion;
}
