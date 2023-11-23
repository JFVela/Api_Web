package com.api.ong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.ong.entity.Voluntario;
import com.api.ong.services.VoluntarioServices;

@RestController
@RequestMapping("/voluntario")
public class VoluntariosController {
	@Autowired
	private VoluntarioServices servicioVolu;
	
	@GetMapping("/lista")
	public List<Voluntario> lista(){
		return servicioVolu.listarTodo();
	}
}