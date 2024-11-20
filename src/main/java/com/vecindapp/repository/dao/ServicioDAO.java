package com.vecindapp.repository.dao;

import com.vecindapp.entity.Calificacion;
import com.vecindapp.entity.Categoria;
import com.vecindapp.entity.Servicio;
import com.vecindapp.repository.jpa.IServicioJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ServicioDAO implements IServicioDAO {

    @Autowired
    IServicioJPA servicioJPA;

    @Override
    public List<Servicio> InsertServicio(Servicio servicio) {
        servicioJPA.save(servicio);
        return listServicios();
    }

    @Override
    public Servicio UpdateServicio(Servicio servicio) {
        return servicioJPA.save(servicio);
    }

    @Override
    public Servicio FindIdServicio(int id) {
        return servicioJPA.findById(id).orElse(null);
    }

    @Override
    public List<Servicio> listServicios() {
        return servicioJPA.findAll();
    }

    @Override
    public List<Servicio> findCategoriaServicio(Categoria categoria) {
        return servicioJPA.findByCategoria(categoria);
    }

    @Override
    public Servicio findNameServicio(String nombre) {
        return servicioJPA.findByNombre(nombre);
    }

    @Override
    public List<Servicio> findCalificacionServicio(Calificacion calificacion) {
        return servicioJPA.findByCalificacion(calificacion);
    }
}
