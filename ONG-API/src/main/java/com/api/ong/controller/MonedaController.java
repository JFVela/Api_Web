package com.api.ong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.ong.entity.Moneda;
import com.api.ong.services.MonedaServices;

@RestController
@RequestMapping("/moneda")
public class MonedaController {
	@Autowired
	private MonedaServices servicioMoneda;
	
	@GetMapping("/lista")
	public List<Moneda>lista(){
		return servicioMoneda.listarTodos();
	}
	
	@PostMapping("/registrar")
	public void registrar(@RequestBody Moneda mon) {
		servicioMoneda.registrar(mon);
	}
	
	@PostMapping("/actualizar")
	public void actualizar(@RequestBody Moneda mon) {
		servicioMoneda.actualizar(mon);
	}
	
	@GetMapping("/buscar/{codi}")
	public Moneda buscar(@PathVariable("codi") Integer cod) {
		return servicioMoneda.buscarPorCodigo(cod);
	}
	@DeleteMapping("/eliminar/{codi}")
	public void eliminar(@PathVariable("codi") Integer cod) {
		servicioMoneda.eliminar(cod);
	}
	
}
