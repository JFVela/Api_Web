package com.api.ong.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@Entity
@Data
@NoArgsConstructor
public class Inscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_inscripcion;

    //Relacion con Voluntario
    @ManyToOne
    @JoinColumn(name = "voluntario_dni")
    private Voluntario voluntario;
    // Relación con Eventos
    @ManyToOne
    @JoinColumn(name = "eventos_id_evento")
    private Eventos eventos;

    // Constructor vacío generado por Lombok
    // Getters y setters generados por Lombok
}
