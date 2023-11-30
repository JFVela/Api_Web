package com.api.ong.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.ong.entity.Campaña;
import com.api.ong.repository.CampañaRepository;

@Service
public class CampañaServices {
	@Autowired
	private CampañaRepository repo;
	
	public void registrar(Campaña bean) {
		repo.save(bean);
	}
	
	public void actualizar(Campaña bean) {
		repo.save(bean);
	}
	
	public void eliminar(Integer cod) {
		repo.deleteById(cod);
	}
	
	public Campaña buscarPorCodigo(Integer cod) {
		return repo.findById(cod).orElse(null);
	}
	
	public List<Campaña> listarTodos(){
		return repo.findAll();
	}
}
