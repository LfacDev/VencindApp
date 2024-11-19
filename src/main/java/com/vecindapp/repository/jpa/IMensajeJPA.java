package com.vecindapp.repository.jpa;

import com.vecindapp.entity.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMensajeJPA extends JpaRepository<Mensaje, Integer> {
}
