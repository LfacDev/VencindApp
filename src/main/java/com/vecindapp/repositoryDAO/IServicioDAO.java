package com.vecindapp.repositoryDAO;

import com.vecindapp.entity.Servicio;
import com.vecindapp.entity.Usuario;

import java.util.List;

public interface IServicioDAO {

    List<Servicio> InsertServicio(Servicio servicio);
    Servicio UpdateServicio(Servicio servicio);
    Servicio FindIdServicio (int id);
    List<Servicio> listServicios();
    Usuario findEmailUsuario(String email);
    Usuario findNameUsuario(String nombre);
    List<Usuario> findEstadoUsuario(String estado);
}
