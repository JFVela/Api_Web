// RolServices.java
package com.api.ong.services;

import com.api.ong.entity.Rol;
import com.api.ong.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
        rolRepo.deleteById(id);
    }

    public Rol buscarRolPorId(Integer id) {
        return rolRepo.findById(id).orElse(null);
    }
}
