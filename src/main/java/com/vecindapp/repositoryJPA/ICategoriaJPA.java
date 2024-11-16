package com.vecindapp.repositoryJPA;

import com.vecindapp.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoriaJPA extends JpaRepository<Categoria, Integer> {
}
