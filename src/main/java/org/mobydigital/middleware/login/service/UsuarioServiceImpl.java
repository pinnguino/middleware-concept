package org.mobydigital.middleware.login.service;

import org.mobydigital.middleware.login.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class UsuarioServiceImpl implements UsuarioService{

    @Override
    public List<Usuario> obtenerUsuarios() {
        // Listar los usuarios
        return Arrays.asList(
            new Usuario(1, "Gaston Gallardo", "gastigallardo@gmail.com", "ggallardo"),
                new Usuario(2, "Manuel Barcena", "mbarcena@gmail.com", "mbarcena"),
                new Usuario(3, "Nicolas Francos", "elcolo@gmail.com", "elcolo"),
                new Usuario(4, "Niko Dreams", "nikodreams@gmail.com", "nikodreams")
        );
    }

    @Override
    public Usuario listarUsuarioCorreo(List<Usuario> listaUsuarios, String email) {
        // Si lo encuentra, obtiene el usuario. Si no, obtiene un null.
        Usuario usuario = listaUsuarios.stream().filter(u -> u.getEmail().equals(email)).findFirst().orElse(null);
        if (usuario != null)
            return usuario;
        return null;
    }

    @Override
    public boolean borrarUsuario(List<Usuario> listaUsuarios, long id) {
        Usuario usuario = listaUsuarios.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
        if (usuario != null) {
            listaUsuarios.remove(usuario);
            return true;
        }
        else {
            return false;
        }
    }
}
