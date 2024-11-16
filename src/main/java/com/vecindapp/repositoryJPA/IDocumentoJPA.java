package com.vecindapp.repositoryJPA;

import com.vecindapp.entity.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDocumentoJPA extends JpaRepository<Documento, Integer> {
}
