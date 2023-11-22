package com.api.ong.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.ong.entity.departamento;
import com.api.ong.repository.DepartamentoRepository;

@Service
public class DepartamentoService {
	@Autowired
	private DepartamentoRepository depa;

	//LISTAR EL DEPARTAMENTO
	public List<departamento> listarDepa() {
		return depa.findAll();
	}
}
