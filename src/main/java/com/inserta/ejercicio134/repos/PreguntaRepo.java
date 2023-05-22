package com.inserta.ejercicio134.repos;

import com.inserta.ejercicio134.models.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreguntaRepo extends JpaRepository<Pregunta, Integer> {
}
