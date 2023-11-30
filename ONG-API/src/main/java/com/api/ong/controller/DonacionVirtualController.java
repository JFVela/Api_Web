package com.api.ong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.ong.entity.DonacionVirtual;
import com.api.ong.services.DonacionVirtualServices;

@RestController
@RequestMapping("/donacionvirtual")
public class DonacionVirtualController {
	@Autowired
	private DonacionVirtualServices servicioDonacionVirtual;
	
	@GetMapping("/lista")
	public List<DonacionVirtual> lista(){
		return servicioDonacionVirtual.listarTodos();
	}
	
}
