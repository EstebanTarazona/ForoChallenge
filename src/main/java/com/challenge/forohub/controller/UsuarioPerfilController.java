package com.challenge.forohub.controller;

import com.challenge.forohub.domain.usuario_perfil.datosListadoUsuarioPerfil;
import com.challenge.forohub.domain.usuario_perfil.DatosRegistro_Usuario_Perfil;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/usuarioperfil")
@SecurityRequirement(name = "bearer-key")
public class UsuarioPerfilController {

    @Autowired
    private com.challenge.forohub.domain.usuario_perfil.usuarioPerfilService usuarioPerfilService;

    @PostMapping
    public ResponseEntity<datosListadoUsuarioPerfil> agregarUsuariosPerfiles(@RequestBody @Valid DatosRegistro_Usuario_Perfil datosRegistroUsuarioPerfil) {
        return ResponseEntity.ok(usuarioPerfilService.agregarPefil(datosRegistroUsuarioPerfil));
    }

    @GetMapping
    public ResponseEntity<List<datosListadoUsuarioPerfil>> mostrarPerfilesUsuarios() {
        return ResponseEntity.ok(usuarioPerfilService.mostrarUsuarioPerfil());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity borrarUsuarioPerfil(@PathVariable Long id) {
        usuarioPerfilService.borrarUsuarioPerfil(id);
        return ResponseEntity.noContent().build();
    }

}
