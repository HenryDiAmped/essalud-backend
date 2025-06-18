package com.reserva.citas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reserva.citas.interfaces.services.IAdministradorService;
import com.reserva.citas.models.Administrador;
import com.reserva.citas.repositorys.AdministradorRepository;

@Service
public class AdministradorService implements IAdministradorService{
	@Autowired
	private AdministradorRepository data;
	
	@Override
	public Administrador guardar(Administrador a) {
		return data.save(a);
	}

}
