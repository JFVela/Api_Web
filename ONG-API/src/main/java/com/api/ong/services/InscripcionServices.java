package com.api.ong.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.ong.entity.Inscripcion;
import com.api.ong.repository.InscripcionRepository;

@Service
public class InscripcionServices {
	@Autowired
	private InscripcionRepository repo;
	
	public List<Inscripcion> listarTodo(){
		return repo.findAll();
	}
	public void insertar(Inscripcion bean) {
		repo.save(bean);
	}
	public void actualizar(Inscripcion bean) {
		repo.save(bean);
	}
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}
	public Inscripcion buscarId(Integer id) {
		return repo.findById(id).orElse(null);
	}
}
