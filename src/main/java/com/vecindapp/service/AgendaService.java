package com.vecindapp.service;

import com.vecindapp.entity.Agenda;
import com.vecindapp.repository.dao.IAgendaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AgendaService implements IAgendaService {

    @Autowired
    IAgendaDAO agendaDAO;


    @Override
    public List<Agenda> showAgendas() {
        return agendaDAO.listAgendas();
    }

    @Override
    public Agenda searchAgendaById(int id) {
        return agendaDAO.findAgendaById(id);
    }

    @Override
    public List<Agenda> addAgenda(Agenda agenda) {
        return agendaDAO.insertAgenda(agenda);
    }

    @Override
    public Agenda updAgenda(Agenda agenda) {
        return agendaDAO.updateAgenda(agenda);
    }

    @Override
    public List<Agenda> searchByFecha(LocalDateTime fecha) {
        return agendaDAO.findByFecha(fecha);
    }

    @Override
    public List<Agenda> searchByEvento(String evento) {
        return agendaDAO.findByEvento(evento);
    }

    @Override
    public List<Agenda> searchByEstado(String estado) {
        return agendaDAO.findByEstado(estado);
    }
}
