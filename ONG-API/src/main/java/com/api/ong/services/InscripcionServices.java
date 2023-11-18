package com.api.ong.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.api.ong.entity.Inscripcion;
import com.api.ong.repository.InscripcionRepository;

public class InscripcionServices {
	@Autowired
	private InscripcionRepository repo;
	
	public List<Inscripcion> listarTodo(){
		return repo.findAll();
	}
}
