package com.reserva.citas.interfaces.services;

import java.util.List;
import java.util.Optional;

import com.reserva.citas.models.JornadaMedicos;

public interface IJornadaMedicosService {
	public List<JornadaMedicos> listar();
	public Optional<JornadaMedicos> listarId(int idJornadaMedicos);
	public JornadaMedicos guardar(JornadaMedicos j);
	public boolean eliminar(int idJornadaMedicos);
}
