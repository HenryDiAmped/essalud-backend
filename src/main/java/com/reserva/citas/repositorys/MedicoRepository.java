package com.reserva.citas.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reserva.citas.models.Medico;

@Repository
public interface MedicoRepository extends CrudRepository<Medico, Integer>{

}
