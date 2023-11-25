package com.api.ong.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.ong.entity.Donante;
public interface DonanteRepository extends JpaRepository<Donante, Integer> {

}
