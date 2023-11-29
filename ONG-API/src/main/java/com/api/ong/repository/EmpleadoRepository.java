package com.api.ong.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.ong.entity.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {

}
