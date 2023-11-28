package com.api.ong.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.ong.entity.Departamento;
import com.api.ong.repository.DepartamentoRepository;

@Service
public class DepartamentoService {
	@Autowired
	private DepartamentoRepository depa;

	// LISTAR EL DEPARTAMENTO
	public List<Departamento> listarDepa() {
		return depa.findAll();
	}

	public void registrar(Departamento bean) {
		depa.save(bean);
	}

	public void actualizar(Departamento bean) {
		depa.save(bean);
	}

	public void eliminar(Integer cod) {
		depa.deleteById(cod);
	}

	public Departamento buscarCod(Integer cod) {
		return depa.findById(cod).orElse(null);
	}
}
