// RolController.java
package com.api.ong.controller;

import com.api.ong.entity.Rol;
import com.api.ong.services.RolServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Roles")
public class RolController {
    @Autowired
    private RolServices rolServices;

    @GetMapping("/lista")
    public List<Rol> listarRoles() {
        return rolServices.listarRoles();
    }

    @PostMapping("/registrar")
    public void registrarRol(@RequestBody Rol rol) {
        rolServices.registrarRol(rol);
    }

    @PutMapping("/actualizar")
    public void actualizarRol(@RequestBody Rol rol) {
        rolServices.actualizarRol(rol);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarRol(@PathVariable("id") Integer id) {
        rolServices.eliminarRol(id);
    }

    @GetMapping("/buscar/{id}")
    public Rol buscarRolPorId(@PathVariable("id") Integer id) {
        return rolServices.buscarRolPorId(id);
    }
}
