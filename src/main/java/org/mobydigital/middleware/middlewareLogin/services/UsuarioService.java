package org.mobydigital.middleware.middlewareLogin.services;

import org.mobydigital.middleware.middlewareLogin.User.Usuario;

import java.util.List;

public interface UsuarioService {
    public List<Usuario> listarUsuarios();
    public List<Usuario> listarUsuariosId(long id);
    public boolean borrarUsuario(long id);
}
