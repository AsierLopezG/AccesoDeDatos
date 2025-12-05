//No teniamos el archivo reservaservicio, basicamente vamos a hacer un calco de aula
package com.example.demo.service;

//Nos falta por importar las utilidades que nos da el SPRING, tambien la que nos conecta con reservaRepository
import com.springframework.beans.factory.annotation.Autowired;//esta
import com.springframework.stereotype.Service;//esta
import com.example.demo.entity.Repository;
import com.example.repository.AulaRepository;
import java.util.List;

// Recoger todas las reservas.
// recoger una reserva.
// Guardar una reserva --Se debe validar horas
// Cambiar una reserva.
// Borrar una reserva.
@Service
public interface ReservaService {

    //llamamos al repository que es lo que nos permite conectarnos con el spring para usar sus metodos mas sencillos
    @Autowired
    private ReservaRepository reservaRepository;

    //Guardamos un reserva
    public Empleado guardarEmpleado(Aula aula) {
        return reservaRepository.save(aula);
    }

    //Recogemos todas la reserva
    public List<Reserva> listarTodos() {
        return reservaRepositoryRepository.findAll();
    }
    //Recogemos un reserva
    public List<Reserva> listarAula() {
        return reservaRepository.find();
    }
    //Borramos un Aula, las encuentras por id y las borra
    public void eliminarAula(Long reservaId) {
        reservaRepository.deleteById(reservaId);
    }


}
