package com.vecindapp.repositoryJPA;

import com.vecindapp.entity.Reporte;
import com.vecindapp.entity.Reserva;
import com.vecindapp.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IReporteJPA extends JpaRepository<Reporte, Integer> {

    //busqueda por usuario
    List<Reporte> FindReporteByUsuario(Usuario usuario);

    //busqueda por estado
    List<Reporte> FindReporteByEstado(String estado);

    //busqueda por reserva
    List<Reporte> FindReporteByReserva(Reserva reserva);
}
