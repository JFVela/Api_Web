package com.api.ong.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.ong.entity.Voluntario;
import com.api.ong.repository.VoluntarioRepository;
@Service
public class VoluntarioServices {
	@Autowired
	private VoluntarioRepository repo;
	
	public List<Voluntario> listarTodo(){
		return repo.findAll();
	}
}
