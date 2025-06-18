package com.reserva.citas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reserva.citas.interfaces.services.IPacienteService;
import com.reserva.citas.models.Paciente;
import com.reserva.citas.repositorys.PacienteRepository;

@Service
public class PacienteService implements IPacienteService{
	@Autowired
	private PacienteRepository data;
	
	@Override
	public Paciente guardar(Paciente p) {
		return data.save(p);
	}

}
