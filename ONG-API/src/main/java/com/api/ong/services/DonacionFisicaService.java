package com.api.ong.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.ong.entity.DonacionFisica;
import com.api.ong.entity.Local;
import com.api.ong.repository.DonacionFisicaRepository;
import java.util.List;
@Service
public class DonacionFisicaService {
	@Autowired
	private DonacionFisicaRepository donfi;
	public List<DonacionFisica> listar(){
		return donfi.findAll();
	}
	public void insertar(DonacionFisica bean) {
		donfi.save(bean);
	}
	public void actualizar(DonacionFisica bean) {
		donfi.save(bean);
	}
	public void eliminar(Integer id) {
		donfi.deleteById(id);
	}
	public DonacionFisica buscaId(Integer id){
		return donfi.findById(id).orElse(null);
	}
}
