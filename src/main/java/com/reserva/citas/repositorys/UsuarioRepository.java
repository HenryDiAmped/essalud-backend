package com.reserva.citas.repositorys;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reserva.citas.models.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
	Optional<Usuario> findByNumDocumento(String numDocumento);
}
