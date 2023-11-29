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
import com.api.ong.services.DonacionFisicaService;
import com.api.ong.entity.DonacionFisica;
@RestController
@RequestMapping("/donfisica")
public class DonacionFisicaController {
	@Autowired
	private DonacionFisicaService donfi;
	
	@GetMapping("/lista")
	public List<DonacionFisica> list(){
		return donfi.listar();
	}
	
	@PostMapping("/registrar")
	public void registrar(@RequestBody DonacionFisica donf) {
		donfi.insertar(donf);
	}
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody DonacionFisica donf) {
		donfi.actualizar(donf);
	}
	@DeleteMapping("/eliminar/{codi}")
	public void eliminar(@PathVariable("codi")Integer cod) {
		donfi.eliminar(cod);
	}
	@GetMapping("/buscar/{codi}")
	public DonacionFisica buscar(@PathVariable("codi")Integer cod) {
		return donfi.buscaId(cod);
	}
}
