package com.vecindapp.repository.jpa;

import com.vecindapp.entity.Calificacion;
import com.vecindapp.entity.Categoria;
import com.vecindapp.entity.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IServicioJPA extends JpaRepository<Servicio, Integer> {

    //busqueda por categoria
    List<Servicio> findByCategoria (Categoria categoria);

    //busqueda por nombre
    Servicio findByNombre (String nombre);

    //busqueda por calificacion
    List<Servicio> findByCalificacion (Calificacion calificacion);

    //cambiar estado
    
}
