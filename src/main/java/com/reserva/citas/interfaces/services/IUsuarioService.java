package com.reserva.citas.interfaces.services;

import java.util.List;
import java.util.Optional;

import com.reserva.citas.models.Usuario;

public interface IUsuarioService {
	public List<Usuario> listar();
	public Optional<Usuario> listarId(int idUsuario);
	public Usuario guardar(Usuario u);
	public boolean eliminar(int idUsuario);
}
