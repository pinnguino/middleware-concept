package org.mobydigital.middleware.login.google;

import org.mobydigital.middleware.login.mediator.MediatorLogin;

public class GoogleLogin {
    private MediatorLogin mediador;

    public GoogleLogin() {};

    public Integer autenticar(String email, String contrasenia){
        return 123;
    }

    public void setMediador(MediatorLogin mediador) {
        this.mediador = mediador;
    }

    public MediatorLogin getMediador() {
        return this.mediador;
    }
}
