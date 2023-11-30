package com.api.ong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.ong.entity.Cuenta;
import com.api.ong.services.CuentaServices;

@RestController
@RequestMapping("/cuenta")
public class CuentaController {
	@Autowired
	private CuentaServices servicioCuenta;
	
	@GetMapping("/lista")
	public List<Cuenta>lista(){
		return servicioCuenta.listarTodos();
	}
}
