package com.api.ong.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.ong.entity.Cuenta;
import com.api.ong.repository.CuentaRepository;

@Service
public class CuentaServices {
	@Autowired
	private CuentaRepository repo;
	
	public List<Cuenta>listarTodos(){
		return repo.findAll();
	}
}
