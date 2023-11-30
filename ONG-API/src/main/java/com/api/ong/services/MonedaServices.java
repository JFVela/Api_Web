package com.api.ong.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.ong.entity.Moneda;
import com.api.ong.repository.MonedaRepository;

@Service
public class MonedaServices {
	@Autowired
	private MonedaRepository repo;
	
	public List<Moneda>listarTodos(){
		return repo.findAll();
	}
	
	public void registrar(Moneda bean) {
		repo.save(bean);
	}
	
	public void actualizar(Moneda bean) {
		repo.save(bean);
	}
	
	public Moneda buscarPorCodigo(Integer cod) {
		return repo.findById(cod).orElse(null);
	}
	
	public void eliminar(Integer cod) {
		repo.deleteById(cod);
	}
	
}
