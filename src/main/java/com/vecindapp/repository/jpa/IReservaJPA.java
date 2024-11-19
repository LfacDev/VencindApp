package com.vecindapp.repository.jpa;

import com.vecindapp.entity.Reserva;
import com.vecindapp.entity.Servicio;
import com.vecindapp.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Instant;
import java.util.List;

public interface IReservaJPA extends JpaRepository<Reserva, Integer> {

    //busqueda por usuario
    List<Reserva> findByUser(Usuario usuario);

    //busqueda por servicio
    List<Reserva> findByServicio(Servicio servicio);

    //busqueda por fecha
    List<Reserva> findByFechaReserva(Instant fechaReserva);
}
