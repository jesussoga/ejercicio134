package com.inserta.ejercicio134.services;

import com.inserta.ejercicio134.models.Pregunta;

import java.util.List;

public interface PreguntaService {
    public List<Pregunta> lista();
    public Pregunta guardar(Pregunta pregunta);
    public Pregunta borrarById(int id);
    public Pregunta devuelvePregunta(int id);
    public boolean validar(Pregunta pregunta);


}
