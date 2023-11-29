// RolRepository.java
package com.api.ong.repository;

import com.api.ong.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol, Integer> {
    // Puedes agregar consultas personalizadas si es necesario
}
