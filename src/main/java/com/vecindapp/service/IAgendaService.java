package com.vecindapp.service;

import com.vecindapp.entity.Agenda;

import java.time.LocalDateTime;
import java.util.List;

public interface IAgendaService {
    //CRUD normal
    List<Agenda> showAgendas();
    Agenda searchAgendaById(int id);
    List<Agenda> addAgenda(Agenda agenda);
    Agenda updAgenda(Agenda agenda);

    //Operaciones adicionales
    List<Agenda> searchByFecha(LocalDateTime fecha);
    List<Agenda> searchByEvento(String evento);
    List<Agenda> searchByEstado(String estado);
}
