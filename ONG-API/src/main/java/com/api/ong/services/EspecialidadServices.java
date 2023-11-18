package com.api.ong.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.ong.entity.Especialidades;
import com.api.ong.repository.EspecialidadesRepository;

@Service
public class EspecialidadServices {
	//inyeccion de dependencias
	@Autowired
	private EspecialidadesRepository repo;
	
	public List<Especialidades> listarTodos(){
		return repo.findAll();
	}
	
}
