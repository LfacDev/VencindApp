package com.vecindapp.repositoryJPA;

import com.vecindapp.entity.Reporte;
import com.vecindapp.entity.Respuesta;
import com.vecindapp.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Instant;
import java.util.List;

public interface IRespuestaJPA extends JpaRepository<Respuesta, Integer> {

    //Busqueda por reporte
    List<Respuesta> FindRespuestaByReporte(Reporte reporte);

    //busqueda por usuario
    List<Respuesta> FindRespuestaByUsuario(Usuario usuario);

    //busqueda por fecha
    List<Respuesta> FindRespuestaByFecha(Instant fecha);

}
