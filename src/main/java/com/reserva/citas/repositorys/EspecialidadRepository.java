package com.reserva.citas.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reserva.citas.models.Especialidad;

@Repository
public interface EspecialidadRepository extends CrudRepository<Especialidad, Integer>{

}
