package com.vecindapp.repository.jpa;

import com.vecindapp.entity.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface IAgendaJPA extends JpaRepository<Agenda, Integer> {

    //Buscar por fecha
    List <Agenda> findByfechaInicio(LocalDateTime fechaInicio);

    //Bucar por nombre de Evento
    List <Agenda> findByEvento(String evento);

    //Buscar por estado
    List <Agenda> findByEstado(String estado);
}
