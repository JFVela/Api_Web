package com.api.ong.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.ong.entity.OngEmpresa;
import com.api.ong.repository.OngEmpresaRepository;

import java.util.List;

@Service
public class OngEmpresaService {
	@Autowired
	private OngEmpresaRepository ongEmpresaRepository;

	public List<OngEmpresa> listar() {
		return ongEmpresaRepository.findAll();
	}

	public void actualizar(OngEmpresa ongEmpresa) {
		ongEmpresaRepository.save(ongEmpresa);
	}

	public OngEmpresa buscarPorId(Integer id) {
		return ongEmpresaRepository.findById(id).orElse(null);
	}
}
