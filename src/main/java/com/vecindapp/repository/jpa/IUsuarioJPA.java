package com.vecindapp.repository.jpa;

import com.vecindapp.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUsuarioJPA extends JpaRepository<Usuario , Integer> {
//crea el crud automaticamente

    //Aqui tambien se puede crar metodos manuales ej busqueda por email

    //busqueda por nombre
    Usuario findUsuarioByName(String nombre);

    //busqueda por email
    Usuario findUsuarioByEmail(String email);

    //busqueda por estado
    List<Usuario> findUsuarioByEstado(String estado); //ya que puede devolver multiples resultados

}
