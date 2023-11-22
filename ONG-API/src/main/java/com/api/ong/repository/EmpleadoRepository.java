package com.api.ong.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.ong.entity.empleado;

public interface EmpleadoRepository extends JpaRepository<empleado, Integer> {

}
