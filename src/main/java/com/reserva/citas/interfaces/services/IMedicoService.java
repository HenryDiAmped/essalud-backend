package com.reserva.citas.interfaces.services;

import java.util.List;
import java.util.Optional;

import com.reserva.citas.models.Medico;

public interface IMedicoService {
	public List<Medico> listar();
	public Optional<Medico> listarId(int idMedico);
	public Medico guardar(Medico m);
	public boolean eliminar(int idMedico);
}
