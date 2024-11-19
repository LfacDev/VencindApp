package com.vecindapp.controller;

import com.vecindapp.entity.Agenda;
import com.vecindapp.service.IAgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "agenda")
public class AgendaController {
    @Autowired
    private IAgendaService service;

    @GetMapping(value = "lista")
    public List<Agenda> listAgenda() {
        return service.showAgendas();
    }

}
