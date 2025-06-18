package com.reserva.citas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reserva.citas.interfaces.services.IEspecialidadService;
import com.reserva.citas.models.Especialidad;
import com.reserva.citas.repositorys.EspecialidadRepository;

@Service
public class EspecialidadService implements IEspecialidadService{
	@Autowired
	private EspecialidadRepository data;
	
	@Override
	public List<Especialidad> listar() {
		List<Especialidad> listar = (List<Especialidad>) data.findAll();
		return listar;
	}

	@Override
	public Optional<Especialidad> listarId(int idEspecialidad) {
		return data.findById(idEspecialidad);
	}

	@Override
	public Especialidad guardar(Especialidad e) {
		return data.save(e);
	}

	@Override
	public boolean eliminar(int idEspecialidad) {
		Optional<Especialidad> especialidadOpt = listarId(idEspecialidad);
		if (especialidadOpt.isPresent()) {
			data.deleteById(idEspecialidad);
			return true;
		}
		return false;
	}

}
