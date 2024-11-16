package com.vecindapp.repositoryJPA;

import com.vecindapp.entity.Chat;
import com.vecindapp.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IChatJPA extends JpaRepository<Chat, Integer> {
    //Buscar por usuario
    Chat findByUsuario (Usuario usuario);
}
