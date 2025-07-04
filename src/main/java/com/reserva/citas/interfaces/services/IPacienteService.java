package com.reserva.citas.interfaces.services;

import java.util.List;

import com.reserva.citas.models.Paciente;

public interface IPacienteService {
	public List<Paciente> listar();
	public Paciente guardar(Paciente p);
}
