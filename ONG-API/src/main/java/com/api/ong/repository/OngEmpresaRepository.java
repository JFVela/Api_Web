package com.api.ong.repository;

import com.api.ong.entity.OngEmpresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OngEmpresaRepository extends JpaRepository<OngEmpresa, Integer> {
	// Puedes agregar consultas personalizadas si es necesario
}
