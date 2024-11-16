package com.vecindapp.repositoryJPA;

import com.vecindapp.entity.Reserva;
import com.vecindapp.entity.Servicio;
import com.vecindapp.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Instant;
import java.util.List;

public interface IReservaJPA extends JpaRepository<Reserva, Integer> {

    //busqueda por usuario
    List<Reserva> FindReservaByUsuario(Usuario usuario);

    //busqueda por servicio
    List<Reserva> FindReservaFindServicio(Servicio servicio);

    //busqueda por fecha
    List<Reserva> FindReservaByFecha(Instant fechaReserva);
}
