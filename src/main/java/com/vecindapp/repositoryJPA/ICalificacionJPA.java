package com.vecindapp.repositoryJPA;

import com.vecindapp.entity.Calificacion;
import com.vecindapp.entity.Servicio;
import com.vecindapp.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Instant;
import java.util.List;

//CRUD para Calificaciones
public interface ICalificacionJPA extends JpaRepository<Calificacion, Integer> {
    //Buscar por usuario
    List <Calificacion> findByUsuario (Usuario usuario);

    //Buscar por fecha
    List <Calificacion> findByFecha(Instant fecha);

    //Buscar por servicio
    List <Calificacion> findByServicio(Servicio servicio);

    //Buscar por calificacion
    List <Calificacion> findByCalificacion(Calificacion calificacion);

}
