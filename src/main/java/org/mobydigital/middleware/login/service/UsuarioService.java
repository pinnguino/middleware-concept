package org.mobydigital.middleware.login.service;

import org.mobydigital.middleware.login.models.Usuario;

import java.util.List;

public interface UsuarioService {
    public List<Usuario> obtenerUsuarios();
    public Usuario listarUsuarioCorreo(List<Usuario> listaUsuarios, String email);
    public boolean borrarUsuario(List<Usuario> listaUsuarios, long id);
}
