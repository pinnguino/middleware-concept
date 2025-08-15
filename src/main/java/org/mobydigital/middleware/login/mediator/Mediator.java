package org.mobydigital.middleware.login.mediator;

import org.mobydigital.middleware.login.models.Usuario;

public interface Mediator {
    public Usuario notificarLogin(String email, String contrasenia);
}
