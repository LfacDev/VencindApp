package com.vecindapp.repositoryJPA;

import com.vecindapp.entity.Favorito;
import com.vecindapp.entity.Pago;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Instant;
import java.util.List;

public interface IPagoJPA extends JpaRepository<Pago, Integer> {
    //Consultar por estado del pago
    List <Pago> findByEstadoPago(String estadoPago);

    //Buscar por fecha de pago
    List<Pago> findByFecha (Instant fecha);
}
