package com.reserva.citas.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reserva.citas.models.JornadaMedicos;

@Repository
public interface JornadaMedicoRepository extends CrudRepository<JornadaMedicos, Integer>{

}
