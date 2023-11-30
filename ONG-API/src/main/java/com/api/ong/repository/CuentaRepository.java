package com.api.ong.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.ong.entity.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta, Integer> {

}
