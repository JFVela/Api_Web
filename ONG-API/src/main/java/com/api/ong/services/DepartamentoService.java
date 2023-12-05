package com.api.ong.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.api.ong.entity.Departamento;
import com.api.ong.repository.DepartamentoRepository;

import Excepctios.mensajeError;

@Service
public class DepartamentoService {
	@Autowired
	private DepartamentoRepository depa;

	// LISTAR EL DEPARTAMENTO
	public List<Departamento> listarDepa() {
		return depa.findAll();
	}

	public void registrar(Departamento bean) {
		depa.save(bean);
	}

	public void actualizar(Departamento bean) {
		depa.save(bean);
	}

	public void eliminar(Integer cod) {
        if (verificarDepaSinEmpleados(cod)) {
            try {
                depa.deleteById(cod);
            } catch (DataIntegrityViolationException e) {
                throw new mensajeError("No se puede eliminar el departamento porque tiene empleados asociados.");
            }
        } else {
            throw new mensajeError("No se puede eliminar el departamento porque tiene empleados asociados.");
        }
    }

	public Departamento buscarCod(Integer cod) {
		return depa.findById(cod).orElse(null);
	}

	public boolean verificarDepaSinEmpleados(Integer cod) {
		Departamento departamento = buscarCod(cod);
		return departamento != null && (departamento.getListaEmple() == null || departamento.getListaEmple().isEmpty());
	}
}
