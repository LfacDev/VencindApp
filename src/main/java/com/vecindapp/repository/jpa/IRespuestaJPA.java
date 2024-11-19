package com.vecindapp.repository.jpa;

import com.vecindapp.entity.Reporte;
import com.vecindapp.entity.Respuesta;
import com.vecindapp.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Instant;
import java.util.List;

public interface IRespuestaJPA extends JpaRepository<Respuesta, Integer> {

    //Busqueda por reporte
    List<Respuesta> findByReporte(Reporte reporte);

    //busqueda por usuario
    List<Respuesta> findByUser(Usuario usuario);

    //busqueda por fecha
    List<Respuesta> findByFecha(Instant fecha);

}
