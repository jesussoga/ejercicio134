package com.inserta.ejercicio134.services;

import com.inserta.ejercicio134.models.Pregunta;
import com.inserta.ejercicio134.repos.PreguntaRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PreguntaServiceImpl implements PreguntaService{
    public final PreguntaRepo preguntaRepo;

    public PreguntaServiceImpl(PreguntaRepo preguntaRepo) {
        this.preguntaRepo = preguntaRepo;
    }

    @Override
    public List<Pregunta> lista() {
        return preguntaRepo.findAll();
    }

    @Override
    public Pregunta guardar(Pregunta pregunta) {
        if(this.validar(pregunta)){
            return preguntaRepo.save(pregunta);
        }
        return null;
    }

    @Override
    public Pregunta borrarById(int id) {
        return preguntaRepo.findById(id).orElse(null);
    }

    @Override
    public Pregunta devuelvePregunta(int id) {
        return preguntaRepo.findById(id).orElse(null);
    }

    @Override
    public boolean validar(Pregunta pregunta) {
        boolean valida = false;
        try {
            if (!pregunta.getPregunta().isBlank()){
                if (!pregunta.getRespuesta1().isBlank() || !pregunta.getRespuesta2().isBlank() || !pregunta.getRespuesta3().isBlank()){
                    if (!pregunta.getValida().isBlank()){
                        return valida;
                    }
                }
            }
        } catch (NullPointerException e) {
        }
        return valida;
    }


}
