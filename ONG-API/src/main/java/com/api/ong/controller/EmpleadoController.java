// EmpleadoController.java
package com.api.ong.controller;

import com.api.ong.entity.Empleado;
import com.api.ong.services.EmpleadoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Empleado")
public class EmpleadoController {
	@Autowired
	private EmpleadoServices servicioEmple;

	@GetMapping("/lista")
	private List<Empleado> lista() {
		return servicioEmple.listarEmple();
	}

	@PostMapping("/registrar")
	private void registrar(@RequestBody Empleado e) {
		servicioEmple.registrar(e);
	}

	@PutMapping("/actualizar")
	private void actualizar(@RequestBody Empleado e) {
		servicioEmple.actualizar(e);
	}

	@DeleteMapping("/eliminar/{id}")
	private void eliminar(@PathVariable("id") Integer id) {
		servicioEmple.eliminar(id);
	}

	@GetMapping("/buscar/{id}")
	public Empleado buscar(@PathVariable("id") Integer id) {
		return servicioEmple.buscarPorId(id);
	}
}
