package com.reserva.citas.interfaces.services;

import java.util.List;
import java.util.Optional;

import com.reserva.citas.models.DetalleSede;

public interface IDetalleSedeService {
	public List<DetalleSede> listar();
	public Optional<DetalleSede> listarId(int idDetalleSede);
	public DetalleSede guardar(DetalleSede d);
	public boolean eliminar(int idDetalleSede);
}
