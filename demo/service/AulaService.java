package com.example.demo.service;

//Nos falta por importar las utilidades que nos da el SPRING, tambien la que nos conecta con reservaRepository
import com.springframework.beans.factory.annotation.Autowired;//esta
import com.springframework.stereotype.Service;//esta
import com.example.demo.entity.Aula;
import com.example.repository.AulaRepository;
import java.util.List;

// Recoger todas las reservas.
// recoger una reserva.
// Guardar una reserva --Se debe validar horas
// Cambiar una reserva.
// Borrar una reserva.
@Service
public interface AulaService {

    //llamamos al repository que es lo que nos permite conectarnos con el spring para usar sus metodos mas sencillos
    @Autowired
    private AulaRepository aulaRepository;

    //Guardamos un aula 
    public Empleado guardarAula(Aula aula) {
        return aulaRepository.save(aula);
    }

    //Recogemos todas la aulas
    public List<Aula> listarTodos() {
        return aulaRepositoryRepository.findAll();
    }

    //Recogemos un aula 
    public List<Aula> listarAula() {
        return aulaRepository.find();
    }

    //Borramos un Aula, las encuentras por id y las borra
    public void eliminarAula(Long idAula) {
        aulaRepository.deleteById(idAula);
    }
  

}
