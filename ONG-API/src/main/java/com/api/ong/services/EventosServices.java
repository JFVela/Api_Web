package com.api.ong.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.ong.entity.Eventos;
import com.api.ong.entity.Inscripcion;
import com.api.ong.repository.EventosRepository;
import com.api.ong.repository.VoluntarioRepository;

@Service
public class EventosServices {
	@Autowired
	private EventosRepository repo;
	
	@Autowired
	private VoluntarioRepository voluntarioRepo;
	
	public List<Eventos> listarTodo(){
		return repo.findAll();
	}
	public void insertar(Eventos bean) {
		repo.save(bean);
	}
	public void actualizar(Eventos bean) {
		repo.save(bean);
	}
	  @Transactional
	    public void eliminar(Integer id) {
	        // Buscar el evento por ID
	        Eventos evento = repo.findById(id).orElse(null);

	        if (evento != null) {
	            // Eliminar todos los voluntarios asociados al evento
	            List<Inscripcion> inscripciones = evento.getListaInscripcion();
	            for (Inscripcion inscripcion : inscripciones) {
	                voluntarioRepo.deleteById(inscripcion.getVoluntario().getDni());
	            }

	            // Eliminar el evento
	            repo.deleteById(id);
	        }
	    }
	public Eventos buscarId(Integer id) {
		return repo.findById(id).orElse(null);
	}
}
