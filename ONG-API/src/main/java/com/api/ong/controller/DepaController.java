package com.api.ong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.ong.entity.Departamento;
import com.api.ong.services.DepartamentoService;

import Excepctios.mensajeError;
import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/Depa")
public class DepaController {
	@Autowired
	private DepartamentoService servicioDepa;

	@GetMapping("/lista")
	public List<Departamento> lista() {
		return servicioDepa.listarDepa();
	}

	@PostMapping("/registrar")
	private void registrar(@RequestBody Departamento d) {
		servicioDepa.registrar(d);
	}

	@PutMapping("/actualizar")
	private void actualizar(@RequestBody Departamento d) {
		servicioDepa.actualizar(d);
	}

	@DeleteMapping("/eliminar/{codi}")
	private ResponseEntity<String> eliminar(@PathVariable("codi") Integer cod) {
		try {
			servicioDepa.eliminar(cod);
			return new ResponseEntity<>("Departamento eliminado con éxito", HttpStatus.OK);
		} catch (mensajeError e) {
			return new ResponseEntity<>("No se puede eliminar el Departamento: " + e.getMessage(),
					HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			return new ResponseEntity<>("Error al procesar la solicitud", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/buscar/{codi}")
	public Departamento buscar(@PathVariable("codi") Integer cod) {
		return servicioDepa.buscarCod(cod);
	}

}
