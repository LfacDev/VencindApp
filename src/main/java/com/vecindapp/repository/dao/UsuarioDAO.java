package com.vecindapp.repository.dao;

import com.vecindapp.entity.Usuario;
import com.vecindapp.repository.jpa.IUsuarioJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioDAO implements IUsuarioDAO {

    //Sobreescritura de metodos en una interfaz es polimoirfismo (por medio del @Override)

    //inyeccion de depedencias
    @Autowired
    IUsuarioJPA usuarioJPA;

    @Override
    public List<Usuario> InsertUsuario(Usuario usuario) {
        usuarioJPA.save(usuario);
        return listUsuarios();
    }

    @Override
    public Usuario UpdateUsuario(Usuario usuario) {
        return usuarioJPA.save(usuario);
    }

    @Override
    public Usuario FindIdUsuario(int id) {
        return usuarioJPA.findById(id).orElse(null);
    }

    @Override
    public List<Usuario> listUsuarios() {
        return usuarioJPA.findAll();
    }

    @Override
    public Usuario findEmailUsuario(String email) {
        return usuarioJPA.findUsuarioByEmail(email);
    }

    @Override
    public Usuario findNameUsuario(String nombre) {
        return usuarioJPA.findUsuarioByName(nombre);
    }

    @Override
    public List<Usuario> findEstadoUsuario(String estado) {
        return usuarioJPA.findUsuarioByEstado(estado);
    }

}
