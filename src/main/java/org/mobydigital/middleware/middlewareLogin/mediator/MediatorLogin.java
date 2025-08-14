package org.mobydigital.middleware.middlewareLogin.mediator;

import org.mobydigital.middleware.middlewareLogin.User.Usuario;
import org.mobydigital.middleware.middlewareLogin.googleLogin.GoogleLogin;

import java.util.ArrayList;
import java.util.List;

public class MediatorLogin {

    private List<Usuario> usuarios = new ArrayList<>();
    private GoogleLogin google;

    public MediatorLogin(){

    }

    private Usuario buscarUsuario(String email){
        return usuarios.stream().filter(usuarios -> usuarios.getEmail().equals(email)).findFirst().orElse(null);
    }

    public boolean notificarLogin (Usuario sender, String evento) throws IllegalArgumentException{
        Usuario usuario = buscarUsuario(sender.getEmail());
        boolean resultado = false;
        if(usuario != null){
            if(evento == "autenticar"){
                Integer token = google.autenticar(sender.getEmail(), sender.getContrasenia());
                if(token != null){
                    resultado = true;
                }
            }
        }else{
            throw new IllegalArgumentException();
        }
        return resultado;
    }

}
