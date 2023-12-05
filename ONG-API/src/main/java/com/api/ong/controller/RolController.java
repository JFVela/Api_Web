// RolController.java
package com.api.ong.controller;

import com.api.ong.entity.Rol;
import com.api.ong.services.RolServices;

import Excepctios.mensajeError;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> eliminarRol(@PathVariable Integer id) {
        try {
            rolServices.eliminarRol(id);
            return new ResponseEntity<>("Rol eliminado con éxito", HttpStatus.OK);
        } catch (mensajeError e) {
            return new ResponseEntity<>("No se puede eliminar el Rol: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al procesar la solicitud", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscar/{id}")
    public Rol buscarRolPorId(@PathVariable("id") Integer id) {
        return rolServices.buscarRolPorId(id);
    }
}
