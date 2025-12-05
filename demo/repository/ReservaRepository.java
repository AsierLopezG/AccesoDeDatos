package com.example.demo.repository;

import com.example.demo.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;//falta importar el stereotype repository

//Indicamos que es repository, aula estaba mal escrito y el atribulo id que es la clave era un Long no un String 
@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
   
}
