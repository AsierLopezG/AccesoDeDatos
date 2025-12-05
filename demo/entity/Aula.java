package com.example.demo.entity;

import jakarta.persistence.*;


//Estamos indicando que es una entidad traida de la suspuesta base de datos 
@Entity
@Table(name = "Aula")

public class Aula {

    // añadir mínimo 3 atributos (ejemplo: nombre, capacidad, edificio)
    @Id
    @GeneratedValue(strategy = GenerationType.INDETITY)

    //Cada columna equivale a un atributo 
    @Column(name = "id_aula")
    private Long idAula;

    @Column(name = "nombre")
    private String name

    @Column(name = "capacidad")
    private Integer capacity

    @Column(name = "edificio")
    private String edificio

    //Constructor
    public Aula(Long idAula,String name, Integer capacity, String Edificio){

        this.idAula = idAula;
        this.name = name;
        this.capacity = capacity;
        this.Edificio = edificio;

    } 

    //Getters y Setters
    public Long getIdAula(){
        return idAula;
    }
    public void setIdAula(Long newId){
        newId = idAula;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        newName = name;
    }
    public Integer getCapacity(){
        return capacity;
    }
    public void setCapacity(Integer newCapacity){
        newCapacity = capacity;
    }
    public String getEdificio(){
        return edificio;
    }
    public void setIdAula(String newEdificio){
        newEdificio = edificio;
    }



  
}
