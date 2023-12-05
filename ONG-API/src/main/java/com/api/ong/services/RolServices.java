// RolServices.java
package com.api.ong.services;

import com.api.ong.entity.Rol;
import com.api.ong.repository.RolRepository;

import Excepctios.mensajeError;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServices {
	@Autowired
	private RolRepository rolRepo;

	public List<Rol> listarRoles() {
		return rolRepo.findAll();
	}

	public void registrarRol(Rol rol) {
		rolRepo.save(rol);
	}

	public void actualizarRol(Rol rol) {
		rolRepo.save(rol);
	}

	public void eliminarRol(Integer id) {
        if (verificarRolSinEmpleados(id)) {
            try {
                rolRepo.deleteById(id);
            } catch (DataIntegrityViolationException e) {
                throw new mensajeError("No se puede eliminar el rol porque tiene empleados asociados.");
            }
        } else {
            throw new mensajeError("No se puede eliminar el rol porque tiene empleados asociados.");
        }
    }

	public Rol buscarRolPorId(Integer id) {
		return rolRepo.findById(id).orElse(null);
	}

	public boolean verificarRolSinEmpleados(Integer id) {
		Rol rol = buscarRolPorId(id);
		return rol != null && (rol.getListaEmple() == null || rol.getListaEmple().isEmpty());
	}
}
