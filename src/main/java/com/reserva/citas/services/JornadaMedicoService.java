package com.reserva.citas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reserva.citas.interfaces.services.IJornadaMedicosService;
import com.reserva.citas.models.JornadaMedicos;
import com.reserva.citas.repositorys.JornadaMedicoRepository;

@Service
public class JornadaMedicoService implements IJornadaMedicosService{
	@Autowired
	private JornadaMedicoRepository data;
	
	@Override
	public List<JornadaMedicos> listar() {
		List<JornadaMedicos> listar = (List<JornadaMedicos>) data.findAll();
		return listar;
	}

	@Override
	public Optional<JornadaMedicos> listarId(int idJornadaMedicos) {
		return data.findById(idJornadaMedicos);
	}

	@Override
	public JornadaMedicos guardar(JornadaMedicos j) {
		return data.save(j);
	}

	@Override
	public boolean eliminar(int idJornadaMedicos) {
		Optional<JornadaMedicos> jornadaMedicosOpt = listarId(idJornadaMedicos);
		if (jornadaMedicosOpt.isPresent()) {
			data.deleteById(idJornadaMedicos);
			return true;
		}
		return false;
	}

}
