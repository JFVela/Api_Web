// EmpleadoServices.java
package com.api.ong.services;

import com.api.ong.entity.Empleado;
import com.api.ong.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServices {
	@Autowired
	private EmpleadoRepository empleRepo;

	public List<Empleado> listarEmple() {
		return empleRepo.findAll();
	}

	public void registrar(Empleado bean) {
		empleRepo.save(bean);
	}

	public void actualizar(Empleado bean) {
		empleRepo.save(bean);
	}

	public void eliminar(Integer id) {
		empleRepo.deleteById(id);
	}

	public Empleado buscarPorId(Integer id) {
		return empleRepo.findById(id).orElse(null);
	}
}
