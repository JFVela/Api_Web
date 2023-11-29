package com.api.ong.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.ong.entity.*;
import com.api.ong.repository.DonanteRepository;

@Service
public class DonanteService {
	@Autowired
	private DonanteRepository don;
	public List<Donante> listarTodo() {
		return don.findAll();
	}
	public void actualizar(Donante bean) {
		don.save(bean);
	}
	public void eliminar(Integer id) {
		don.deleteById(id);
	}
	public Donante buscaId(Integer id){
		return don.findById(id).orElse(null);
	}
}
