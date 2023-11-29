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
	@PostMapping("/registrar")
	public void registrar(@RequestBody Especialidades even) {
		servicioEspe.insertar(even);
	}
	@PutMapping("actualizar")
	public void actualizar(@RequestBody Especialidades even) {
		servicioEspe.actualizar(even);
	}
	@DeleteMapping("/eliminar({cod}")
	public void eliminar(@PathVariable("cod")Integer cod) {
		servicioEspe.eliminar(cod);
	}
	@GetMapping("/buscar/{cod}")
	public Especialidades buscar(@PathVariable("cod")Integer cod) {
		return servicioEspe.buscarId(cod);
	}
}
