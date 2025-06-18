package com.reserva.citas.interfaces.services;

import java.util.List;
import java.util.Optional;

import com.reserva.citas.models.Especialidad;

public interface IEspecialidadService {
	public List<Especialidad> listar();
	public Optional<Especialidad> listarId(int idEspecialidad);
	public Especialidad guardar(Especialidad e);
	public boolean eliminar(int idEspecialidad);
}
