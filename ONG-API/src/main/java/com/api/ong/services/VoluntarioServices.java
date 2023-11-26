package com.api.ong.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.ong.entity.Inscripcion;
import com.api.ong.entity.Voluntario;
import com.api.ong.repository.InscripcionRepository;
import com.api.ong.repository.VoluntarioRepository;

@Service
public class VoluntarioServices {
	@Autowired
	private VoluntarioRepository repo;
	@Autowired
    private InscripcionRepository inscripcionRepo;
	
	public List<Voluntario> listarTodo(){
		return repo.findAll();
	}
	
	 @Transactional
	public void insertar(Voluntario voluntario, Inscripcion inscripcion) {
		repo.save(voluntario);
		
        inscripcion.setVoluntario(voluntario);
        
        inscripcionRepo.save(inscripcion);

	}
	public void actualizar(Voluntario bean) {
		repo.save(bean);
	}
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}
	public Voluntario buscarId(Integer id) {
		return repo.findById(id).orElse(null);
	}
}
