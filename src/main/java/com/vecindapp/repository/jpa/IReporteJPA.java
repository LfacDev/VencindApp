package com.vecindapp.repository.jpa;

import com.vecindapp.entity.Reporte;
import com.vecindapp.entity.Reserva;
import com.vecindapp.entity.Usuario;
import org.springframework.data.domain.Limit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IReporteJPA extends JpaRepository<Reporte, Integer> {

    //busqueda por usuario
    List<Reporte> findByUsuario(Usuario usuario);

    //busqueda por estado
    List<Reporte> findByEstado(String estado);

    List<Reporte> findByReserva(Reserva reserva);
}
