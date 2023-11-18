package com.api.ong.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.api.ong.entity.Voluntario;
import com.api.ong.repository.VoluntarioRepository;

public class VoluntarioServices {
	@Autowired
	private VoluntarioRepository repo;
	
	public List<Voluntario> listarTodo(){
		return repo.findAll();
	}
}
