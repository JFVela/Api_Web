package com.api.ong.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.ong.entity.empleado;
import com.api.ong.repository.EmpleadoRepository;

@Service

public class EmpleadoServices {
	@Autowired
	private EmpleadoRepository empleRepo;

	public List<empleado> listarEmple() {
		return empleRepo.findAll();
	}
}
