package com.api.ong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.api.ong.entity.*;
import com.api.ong.services.*;

@RestController
@RequestMapping("/local")
public class LocalController {
	@Autowired
	private LocalService lol;
	
	@GetMapping("/lista")
	public List<Local> listar(){
		return lol.listar();
	}
	
	@PostMapping("/registrar")
	public void registrar(@RequestBody Local loc) {
		lol.insertar(loc);
	}
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Local loc) {
		lol.actualizar(loc);
	}
	@DeleteMapping("/eliminar/{codi}")
	public void eliminar(@PathVariable("codi")Integer cod) {
		lol.eliminar(cod);
	}
	@GetMapping("/buscar/{codi}")
	public Local buscar(@PathVariable("codi")Integer cod) {
		return lol.buscaId(cod);
	}
	
}
