package com.api.ong.controller;

import com.api.ong.entity.OngEmpresa;
import com.api.ong.services.OngEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ong")
public class OngEmpresaController {
	@Autowired
	private OngEmpresaService ongEmpresaService;

	@GetMapping("/listar")
	public ResponseEntity<List<OngEmpresa>> listarOngs() {
		List<OngEmpresa> ongs = ongEmpresaService.listar();
		return new ResponseEntity<>(ongs, HttpStatus.OK);
	}

	@PutMapping("/actualizar")
	public ResponseEntity<Void> actualizarOng(@RequestBody OngEmpresa ongEmpresa) {
		ongEmpresaService.actualizar(ongEmpresa);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/buscar/{id}")
	public ResponseEntity<OngEmpresa> buscarOngPorId(@PathVariable Integer id) {
		OngEmpresa ong = ongEmpresaService.buscarPorId(id);
		return new ResponseEntity<>(ong, HttpStatus.OK);
	}
}
