package com.api.ong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.ong.entity.Inscripcion;
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
	@PostMapping("/registrar")
	public void registrar(@RequestBody Voluntario even, Inscripcion ins) {
		servicioVolu.insertar(even, ins);
	}
	@PutMapping("actualizar")
	public void actualizar(@RequestBody Voluntario even) {
		servicioVolu.actualizar(even);
	}
	@DeleteMapping("/eliminar({cod}")
	public void eliminar(@PathVariable("cod")Integer cod) {
		servicioVolu.eliminar(cod);
	}
	@GetMapping("/buscar/{cod}")
	public Voluntario buscar(@PathVariable("cod")Integer cod) {
		return servicioVolu.buscarId(cod);
	}
}