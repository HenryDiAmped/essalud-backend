package com.reserva.citas.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reserva.citas.models.Sede;

@Repository
public interface SedeRepository extends CrudRepository<Sede, Integer>{

}
