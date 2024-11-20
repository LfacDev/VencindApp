package com.vecindapp.controller;

import com.vecindapp.entity.Servicio;
import com.vecindapp.service.IServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping(value = "servicio")
public class ServicioController {

    //se comunica con la capa service
    //inyeccion de dependencias
    //cambio prueba
    @Autowired
    IServicioService servicioService;

    //EndPoints
    @GetMapping(value = "lista", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Servicio>> getAllServicios(){

        //1. Agregar en la cabecera la cantidad de registros

        List<Servicio> servicios = servicioService.listServicios();
        int cantServicios = servicios.size();

        //2. cantDatos agregarlo a la cabecera del servicio

        HttpHeaders headers = new HttpHeaders(); //instanciar un objeto de tipo HttpHeaders
        headers.add("cant_Servicios", String.valueOf(cantServicios));

        //3.Cambiar la respuesta del metodo a ResponseEntity
        //4.Cambiar el return a ResponseEntity

        return new ResponseEntity<List<Servicio>>(servicios, headers, HttpStatus.ACCEPTED);
    }
}
