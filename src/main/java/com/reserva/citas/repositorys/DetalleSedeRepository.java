package com.reserva.citas.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reserva.citas.models.DetalleSede;

@Repository
public interface DetalleSedeRepository extends CrudRepository<DetalleSede, Integer>{

}
