package com.vecindapp.repository.dao;


import com.vecindapp.entity.Agenda;

import java.time.LocalDateTime;
import java.util.List;

public interface IAgendaDAO {
// Aquí se implementan los metodos abstractos (sin cuerpo)
    //Que van a hacer implementados automaticamente


    //CRUD normal
    List<Agenda> listAgendas();
    Agenda findAgendaById(int id);
    List<Agenda> insertAgenda(Agenda agenda);
    Agenda updateAgenda(Agenda agenda);

    //Operaciones adicionales
    List<Agenda> findByFecha(LocalDateTime fecha);
    List<Agenda> findByEvento(String evento);
    List<Agenda> findByEstado(String estado);

}
