package com.api.ong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.ong.entity.departamento;
import com.api.ong.services.DepartamentoService;

@RestController
@RequestMapping("/Depa")
public class DepaController {
	@Autowired
	private DepartamentoService servicioDepa;
	@GetMapping("/lista")
	public List<departamento> lista(){
		return servicioDepa.listarDepa();
	}

}
