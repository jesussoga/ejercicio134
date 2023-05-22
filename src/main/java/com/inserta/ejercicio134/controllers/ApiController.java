package com.inserta.ejercicio134.controllers;

import com.inserta.ejercicio134.models.Pregunta;
import com.inserta.ejercicio134.services.PreguntaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
public class ApiController {
    private final PreguntaService preguntaService;

    public ApiController(PreguntaService preguntaService) {
        this.preguntaService = preguntaService;
    }

    @GetMapping("/preguntas/formulario")
    public String formulario(){
        return "formulario";
    }

    @ResponseBody
    @GetMapping("/preguntas")
    public List<Pregunta> listaPreguntas(){
        return preguntaService.lista();
    }

    @ResponseBody
    @PostMapping("/preguntas/agregar")
    public Pregunta guardar(@RequestBody Pregunta pregunta){
        return preguntaService.guardar(pregunta);
    }
    @ResponseBody
    @GetMapping("/preguntas/agregar")
    public Pregunta addPregunta(
            @RequestParam String pregunta,
            @RequestParam String respValida,
            @RequestParam String respuesta1,
            @RequestParam String respuesta2,
            @RequestParam String respuesta3
    ){
        Pregunta nuevaPregunta = new Pregunta(0, pregunta, respValida, respuesta1, respuesta2, respuesta3);
        return preguntaService.guardar(nuevaPregunta);
    }
    @ResponseBody
    @DeleteMapping("preguntas/{id}")
    public Pregunta borrarPorId(@PathVariable Integer id){
        return preguntaService.borrarById(id);
    }
    @ResponseBody
    @GetMapping("/preguntas/{id}")
    public Pregunta obtenerPorId(@PathVariable Integer id){
        return preguntaService.devuelvePregunta(id);
    }
}
