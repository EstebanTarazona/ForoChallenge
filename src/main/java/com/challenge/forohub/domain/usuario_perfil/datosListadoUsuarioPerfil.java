package com.challenge.forohub.domain.usuario_perfil;

public record datosListadoUsuarioPerfil(
        String nomrbreUsuario,
        String nombrePerfil
) {
    public datosListadoUsuarioPerfil(Usuario_Perfil usuarioPerfil) {
        this(usuarioPerfil.getUsuario().getNombre(), usuarioPerfil.getPerfil().getNombre());
    }
}
