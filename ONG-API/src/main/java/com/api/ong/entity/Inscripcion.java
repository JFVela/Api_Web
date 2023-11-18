package com.api.ong.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "inscripcion")
@Data
@NoArgsConstructor
public class Inscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inscripcion")
    private Integer codigoInscr;

    //Relacion con Voluntario
    @ManyToOne
    @JoinColumn(name = "voluntario_dni", insertable = false, updatable = false)
    private Voluntario voluntario;
    // Relación con Eventos
    @ManyToOne
    @JoinColumn(name = "eventos_id_evento", insertable = false, updatable = false)
    private Eventos eventos;

    // Constructor vacío generado por Lombok
    // Getters y setters generados por Lombok
}
