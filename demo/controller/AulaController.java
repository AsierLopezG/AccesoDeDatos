package com.example.demo.controller;

//Importamos las bibliotecas que nos faltan y el aulas service para que se conceten
import com.example.service.AulaService;
import com.springframework.web.bind.annotation.*;
import com.springframework.beans.factory.annotation.Autowired;

import java.util.List;
  // Devolver todas las aulas
  // Devolver un aula 
  // añadir aula -- no se debe repetir
  // modificar aula
  // borrar aula
//en este tenemos que indicar que es un controller y concetarlo con el service para usar esos metodos previamente hechos 

@RestController
@RequestMapping("/api/aula")
public class AulaController {

  @Autowired
  private final AulaService aulaService;

  public AulaController(AulaService aulaService) {
    this.aulaService = aulaService;
  }

  // GUARDAR O ACTUALIZAR (POST)
    @PostMapping
    public Aula guardar(@RequestBody Aula aula) {
        return aulaService.guardarAula(aula);
    }

    // LISTAR TODOS (GET)
    @GetMapping
    public List<Aula> listar() {
        return aulaService.listarTodos();
    }

    // BUSCAR UNO POR ID 
    @GetMapping("/{id}")
    public Aula obtenerUno(@PathVariable Long idAula) {
        return aulaService.obtenerPorId(idAula);
    }

    // BORRAR POR ID (DELETE)
  
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long idAula) {
        aulaService.eliminarAula(idAula);
    }


}
