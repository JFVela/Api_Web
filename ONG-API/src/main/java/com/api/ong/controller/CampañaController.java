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

import com.api.ong.entity.Campaña;
import com.api.ong.services.CampañaServices;

@RestController
@RequestMapping("/campana")
public class CampañaController {
	@Autowired
	private CampañaServices servicioCampaña;
	
	@GetMapping("/lista")
	public List<Campaña> lista(){
		return servicioCampaña.listarTodos();
	}
	
	@PostMapping("/registrar")
	public void registrar(@RequestBody Campaña cam) {
		servicioCampaña.registrar(cam);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Campaña cam) {
		servicioCampaña.actualizar(cam);
	}
	
	@DeleteMapping("/eliminar/{codi}")
	public void eliminar(@PathVariable("codi")Integer cod) {
		servicioCampaña.eliminar(cod);
	}
	
	@GetMapping("/buscar/{codi}")
	public Campaña buscar(@PathVariable("codi")Integer cod) {
		return servicioCampaña.buscarPorCodigo(cod);
	}
}
