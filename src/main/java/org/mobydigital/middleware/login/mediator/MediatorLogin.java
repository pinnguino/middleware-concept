package org.mobydigital.middleware.login.mediator;

import org.mobydigital.middleware.login.models.Usuario;
import org.mobydigital.middleware.login.google.GoogleLogin;
import org.mobydigital.middleware.login.service.UsuarioService;
import org.mobydigital.middleware.login.service.UsuarioServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class MediatorLogin implements Mediator {

    private List<Usuario> usuarios = new ArrayList<>();
    private GoogleLogin google;

    public MediatorLogin(){
        UsuarioService usuarioService = new UsuarioServiceImpl();
        this.google = new GoogleLogin();
        this.google.setMediador(this);
        this.usuarios = usuarioService.obtenerUsuarios();
    }

    public Usuario buscarUsuario(String email){
        return usuarios.stream()
                .filter(u -> u.getEmail().equals(email)).
                findFirst()
                .orElse(null);
    }

    // Como nuestro medidador se encarga de gestionar una sola conexion, no hace falta hacerla de tipo void.
    public Usuario notificarLogin (String email, String contrasenia) throws IllegalArgumentException {
            // Antes de comunicarme con el servicio de Google, verifico que el usuario exista en la base de datos.
            Usuario u = buscarUsuario(email);
            if(u != null) {
                Integer token = google.autenticar(email, contrasenia);
                if (token != null) return u;
            }
        return null;
    }

}
