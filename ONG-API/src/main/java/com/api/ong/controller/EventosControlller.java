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

import com.api.ong.entity.Eventos;
import com.api.ong.services.EventosServices;



@RestController
@RequestMapping("/eventos")
public class EventosControlller {
	@Autowired
	private EventosServices servicioEven;
	
	@GetMapping("/lista")
	public List<Eventos> lista(){
		return servicioEven.listarTodo();
	}
	
	@PostMapping("/registrar")
	public void registrar(@RequestBody Eventos even) {
		servicioEven.insertar(even);
	}
	@PutMapping("actualizar")
	public void actualizar(@RequestBody Eventos even) {
		servicioEven.actualizar(even);
	}
	@DeleteMapping("/eliminar({cod}")
	public void eliminar(@PathVariable("cod")Integer cod) {
		servicioEven.eliminar(cod);
	}
	@GetMapping("/buscar/{cod}")
	public Eventos buscar(@PathVariable("cod")Integer cod) {
		return servicioEven.buscarId(cod);
	}
}
