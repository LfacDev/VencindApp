package com.vecindapp.repository.dao;

import com.vecindapp.entity.Agenda;
import com.vecindapp.repository.jpa.IAgendaJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public class AgendaDAO implements IAgendaDAO {
    //Aquí se hace la inyeccion de dependencias por el @Autowired
    //Se hace sobre escritura de metodos (polimorfismo) por medio de @Override

    @Autowired
    IAgendaJPA agendaJPA;



    @Override
    public List<Agenda> listAgendas() {
        return agendaJPA.findAll();
    }

    @Override
    public Agenda findAgendaById(int id) {
        return agendaJPA.findById(id).orElse(null);
    }

    @Override
    public List<Agenda> insertAgenda(Agenda agenda) {
        agendaJPA.save(agenda);
        return listAgendas();
    }

    @Override
    public Agenda updateAgenda(Agenda agenda) {
        return agendaJPA.save(agenda);
    }

    @Override
    public List<Agenda> findByFecha(LocalDateTime fecha) {
        agendaJPA.findByfechaInicio(fecha);
        return listAgendas();
    }

    @Override
    public List<Agenda> findByEvento(String evento) {
        agendaJPA.findByEvento(evento);
        return listAgendas();
    }

    @Override
    public List<Agenda> findByEstado(String estado) {
        agendaJPA.findByEstado(estado);
        return listAgendas();
    }


}
