package com.vecindapp.repositoryJPA;

import com.vecindapp.entity.Calificacion;
import com.vecindapp.entity.Favorito;
import com.vecindapp.entity.Servicio;
import com.vecindapp.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFavoritoJPA extends JpaRepository<Favorito, Integer> {

    //Buscar por usuario(trabajador) favorito
    List<Favorito> findByUsuarioFav (Usuario trabajador);

    //Buscar por servicio favorito
    List<Favorito>  findByServicioFav (Servicio servicio);
}
