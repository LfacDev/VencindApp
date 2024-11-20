package com.vecindapp.service;

import com.vecindapp.entity.Calificacion;
import com.vecindapp.entity.Categoria;
import com.vecindapp.entity.Servicio;

import java.util.List;

public interface IServicioService {

    List<Servicio> InsertServicio(Servicio servicio);
    Servicio UpdateServicio(Servicio servicio);
    Servicio FindIdServicio (int id);
    List<Servicio> listServicios();
    List<Servicio> findCategoriaServicio(Categoria categoria);
    Servicio findNameServicio(String nombre);
    List<Servicio> findCalificacionServicio(Calificacion calificacion);
}
