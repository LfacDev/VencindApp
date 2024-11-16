package com.vecindapp.repositoryDAO;

import com.vecindapp.entity.Usuario;

import java.util.List;

public interface IUsuarioDAO {
    //metodos sin cuerpo - abstractos
    //metodos que se implementaran automaticamente

    List<Usuario> InsertUsuario(Usuario usuario);
    Usuario UpdateUsuario(Usuario usuario);
    Usuario FindIdUsuario (int id);
    List<Usuario> listUsuarios();
    Usuario findEmailUsuario(String email);
    Usuario findNameUsuario(String nombre);
    List<Usuario> findEstadoUsuario(String estado);
}
