package com.api.ong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.ong.entity.empleado;
import com.api.ong.services.EmpleadoServices;

@RestController
@RequestMapping("/Empleado")

public class EmpleadoController {
	@Autowired
	private EmpleadoServices servicioEmple;

	@GetMapping("/lista")
	private List<empleado> lista() {
		return servicioEmple.listarEmple();
	}

}
