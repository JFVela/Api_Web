package com.api.ong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.ong.entity.Especialidades;
import com.api.ong.services.EspecialidadServices;

@RestController
@RequestMapping("/especialidad")
public class EspecialidadesController {
	@Autowired
	private EspecialidadServices servicioEspe;
	
	@GetMapping("/lista")
	public List<Especialidades> lista(){
		return servicioEspe.listarTodos();
	}
}
