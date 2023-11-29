package com.api.ong.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.ong.entity.Especialidades;
import com.api.ong.entity.Voluntario;
import com.api.ong.repository.EspecialidadesRepository;
import com.api.ong.repository.VoluntarioRepository;


@Service
public class EspecialidadServices {
	//inyeccion de dependencias
	@Autowired
	private EspecialidadesRepository repo;
	
	@Autowired
	private VoluntarioRepository voluntarioRepo;

	
	public List<Especialidades> listarTodos(){
		return repo.findAll();
	}
	public void insertar(Especialidades bean) {
		repo.save(bean);
	}
	public void actualizar(Especialidades bean) {
		repo.save(bean);
	}
	 @Transactional
	    public void eliminar(Integer id) {
	        // Buscar la especialidad por ID
	        Especialidades especialidad = repo.findById(id).orElse(null);

	        if (especialidad != null) {
	            // Eliminar todos los voluntarios asociados a la especialidad
	            List<Voluntario> voluntarios = especialidad.getListaVoluntario();
	            for (Voluntario voluntario : voluntarios) {
	                voluntarioRepo.deleteById(voluntario.getDni());
	            }

	            // Eliminar la especialidad
	            repo.deleteById(id);
	        }
	    }

	public Especialidades buscarId(Integer id) {
		return repo.findById(id).orElse(null);
	}
}
