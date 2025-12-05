package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
    // añadir mínimo 3 atributos (ejemplo: fecha, horaInicio, horaFin, aulaId)
    // TODO: constructor con parámetros
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //Hacemos los atributos necesarios
    @Column(name ="id")
    private Long reservaId;

    @Column(name = "fecha")
    private LocalDate fecha

    @Column(name = "horaInicio")
    private LocalTime horaInicio

    @Column(name = "horaFin")
    private LocalTime horaFin

    @Column(name = "aulaId")
    private Long aulaID

    //Constructor
    public Reserva(Long reservaId, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin){

        this.reservaId = reservaId;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;

    }
 
    //Getters y Setters
    public Long getReservaID(){
        return reservaId;
    }
    public void setReservaID(Long newreservaID){
        newreservaID = reservaId;
    }
    public Long getAulaID(){
        return idAula;
    }
    public void setIdAula(Long newId){
        newId = idAula;
    }
    public LocalDate getFecha(){
        return fecha;
    }
    public void setFecha(LocalDate newFecha){
        newFecha = fecha;
    }
    public LocalTime getHoraInicio(){
        return horaInicio;
    }
    public void setHoraInicio(LocalTime newhoraInicio){
        newhoraInicio = horaInicio;
    }
    public LocalTime getHoraFin(){
        return horaFin;
    }
    public void setHoraInicio(LocalTime newhoraInicio){
        newhoraFin = horaFin;
    }




}
