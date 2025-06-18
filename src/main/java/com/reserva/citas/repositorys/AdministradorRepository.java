package com.reserva.citas.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reserva.citas.models.Administrador;

@Repository
public interface AdministradorRepository extends CrudRepository<Administrador, Integer>{

}
