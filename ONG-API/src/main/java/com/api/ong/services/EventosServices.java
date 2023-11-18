package com.api.ong.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.api.ong.entity.Eventos;
import com.api.ong.repository.EventosRepository;

public class EventosServices {
	@Autowired
	private EventosRepository repo;
	
	public List<Eventos> listarTodo(){
		return repo.findAll();
	}
}
