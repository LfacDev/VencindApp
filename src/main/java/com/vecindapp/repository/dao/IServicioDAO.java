package com.vecindapp.repository.dao;

import com.vecindapp.entity.Calificacion;
import com.vecindapp.entity.Categoria;
import com.vecindapp.entity.Servicio;
import com.vecindapp.entity.Usuario;

import java.util.List;

public interface IServicioDAO {

    List<Servicio> InsertServicio(Servicio servicio);
    Servicio UpdateServicio(Servicio servicio);
    Servicio FindIdServicio (int id);
    List<Servicio> listServicios();
    List<Servicio> findCategoriaServicio(Categoria categoria);
    Servicio findNameServicio(String nombre);
    List<Servicio> findCalificacionServicio(Calificacion calificacion);
}
