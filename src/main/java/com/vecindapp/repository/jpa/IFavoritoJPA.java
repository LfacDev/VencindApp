package com.vecindapp.repository.jpa;

import com.vecindapp.entity.Calificacion;
import com.vecindapp.entity.Favorito;
import com.vecindapp.entity.Servicio;
import com.vecindapp.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFavoritoJPA extends JpaRepository<Favorito, Integer> {

    //Buscar por usuario(trabajador) favorito
    List<Favorito> findByTrabajador (Usuario trabajador);

    //Buscar por servicio favorito
    List<Favorito>  findByServicio (Servicio servicio);
}
