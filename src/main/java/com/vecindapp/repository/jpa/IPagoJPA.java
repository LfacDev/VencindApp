package com.vecindapp.repository.jpa;

import com.vecindapp.entity.Favorito;
import com.vecindapp.entity.Pago;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Instant;
import java.util.List;

public interface IPagoJPA extends JpaRepository<Pago, Integer> {
    //Consultar por estado del pago
    List <Pago> findByEstado(String estado);

    //Buscar por fecha de pago
    List<Pago> findByFechaPago (Instant fecha);
}
