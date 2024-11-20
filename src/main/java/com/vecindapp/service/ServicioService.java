package com.vecindapp.service;

import com.vecindapp.entity.Calificacion;
import com.vecindapp.entity.Categoria;
import com.vecindapp.entity.Servicio;
import com.vecindapp.repository.dao.IServicioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioService implements IServicioService {

    @Autowired
    IServicioDAO servicioDAO;

    @Override
    public List<Servicio> InsertServicio(Servicio servicio) {
        return servicioDAO.InsertServicio(servicio);
    }

    @Override
    public Servicio UpdateServicio(Servicio servicio) {
        return servicioDAO.UpdateServicio(servicio);
    }

    @Override
    public Servicio FindIdServicio(int id) {
        return servicioDAO.FindIdServicio(id);
    }

    @Override
    public List<Servicio> listServicios() {
        return servicioDAO.listServicios();
    }

    @Override
    public List<Servicio> findCategoriaServicio(Categoria categoria) {
        return servicioDAO.findCategoriaServicio(categoria);
    }

    @Override
    public Servicio findNameServicio(String nombre) {
        return servicioDAO.findNameServicio(nombre);
    }

    @Override
    public List<Servicio> findCalificacionServicio(Calificacion calificacion) {
        return List.of();
    }
}
