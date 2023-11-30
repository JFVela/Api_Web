package com.api.ong.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.ong.entity.DonacionVirtual;
import com.api.ong.repository.DonacionVirtualRepository;

@Service
public class DonacionVirtualServices {
	//Inyeccion de dependencias
	@Autowired
	private DonacionVirtualRepository repo;
	
	public List<DonacionVirtual> listarTodos(){
		return repo.findAll();
	}
}
