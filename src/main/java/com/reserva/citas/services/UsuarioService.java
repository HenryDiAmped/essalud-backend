package com.reserva.citas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reserva.citas.interfaces.services.IUsuarioService;
import com.reserva.citas.models.Usuario;
import com.reserva.citas.repositorys.UsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService{
	@Autowired
	private UsuarioRepository data;
	
	@Override
	public List<Usuario> listar() {
		List<Usuario> listar = (List<Usuario>) data.findAll();
		return listar;
	}

	@Override
	public Optional<Usuario> listarId(int idUsuario) {
		return data.findById(idUsuario);
	}

	@Override
	public Usuario guardar(Usuario u) {
		return data.save(u);
	}

	@Override
	public boolean eliminar(int idUsuario) {
		Optional<Usuario> usuarioOpt = listarId(idUsuario);
		if (usuarioOpt.isPresent()) {
			data.deleteById(idUsuario);
			return true;
		}
		return false;
	}
}
