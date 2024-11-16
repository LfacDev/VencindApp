package com.vecindapp.repositoryJPA;

import com.vecindapp.entity.Calificacion;
import com.vecindapp.entity.Categoria;
import com.vecindapp.entity.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IServicioJPA extends JpaRepository<Servicio, Integer> {

    //busqueda por categoria
    List<Servicio> FindServicioByCategoria (Categoria categoria);

    //busqueda por nombre
    Servicio FindServicioByNombre (String nombre);

    //busqueda por calificacion
    List<Servicio> FindServicioByCalificacion (Calificacion calificacion);

    //cambiar estado
    
}
