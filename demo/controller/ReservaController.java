package com.example.demo.controller;

//Importamos las bibliotecas que nos faltan y el aulas service para que se conceten
import com.example.service.ReservaService;
import com.springframework.web.bind.annotation.*;
import com.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//en este tenemos que indicar que es un controller y concetarlo con el service para usar esos metodos previamente hechos 
@RestController
@RequestMapping("/api/reserva")
public class ReservaController {

  @Autowired
  private final ReservaService ReservaService;

  public ReservaController(ReservaService reservaService) {
    this.reservaService = reservaService;
  }

  // GUARDAR O ACTUALIZAR (POST)
    @PostMapping
    public Rerserva guardar(@RequestBody Reserva reserva) {
        return reservaService.guardarRerserva(reserva);
    }

    // LISTAR TODOS (GET)
    @GetMapping
    public List<Reserva> listar() {
        return ReservaService.listarTodos();
    }

    // BUSCAR UNO POR ID 
    @GetMapping("/{id}")
    public Reserva obtenerUno(@PathVariable Long reservaId) {
        return reservaService.obtenerPorId(reservaId);
    }

    // BORRAR POR ID (DELETE)
  
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long reservaId) {
        reservaService.eliminarReserva(reservaId);
    }


}
