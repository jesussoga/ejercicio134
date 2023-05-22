package com.inserta.ejercicio134.models;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@ToString

@Entity
@Table(name = "preguntas")
public class Pregunta {
    @Id @GeneratedValue
    private int id;
    @Column(length = 100)
    private String pregunta;
    @Column(length = 100)
    private String valida;
    @Column(length = 100)
    private String respuesta1;
    @Column(length = 100)
    private String respuesta2;
    @Column(length = 100)
    private String respuesta3;
}
