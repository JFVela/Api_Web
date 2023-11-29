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
import com.api.ong.services.InscripcionServices;

@RestController
@RequestMapping("/inscripcion")
public class InscripcionController {
	@Autowired
	private InscripcionServices servicioInsc;
	
	@GetMapping("/lista")
	public List<Inscripcion> lista(){
		return servicioInsc.listarTodo();
	}
	@PostMapping("/registrar")
	public void registrar(@RequestBody Inscripcion even) {
		servicioInsc.insertar(even);
	}
	@PutMapping("actualizar")
	public void actualizar(@RequestBody Inscripcion even) {
		servicioInsc.actualizar(even);
	}
	@DeleteMapping("/eliminar({cod}")
	public void eliminar(@PathVariable("cod")Integer cod) {
		servicioInsc.eliminar(cod);
	}
	@GetMapping("/buscar/{cod}")
	public Inscripcion buscar(@PathVariable("cod")Integer cod) {
		return servicioInsc.buscarId(cod);
	}
}
