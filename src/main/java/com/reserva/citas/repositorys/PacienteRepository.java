package com.reserva.citas.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reserva.citas.models.Paciente;

@Repository
public interface PacienteRepository extends CrudRepository<Paciente, Integer>{

}
