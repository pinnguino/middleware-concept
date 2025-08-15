package org.mobydigital.middleware.login.models;

import org.mobydigital.middleware.login.mediator.MediatorLogin;

public class Usuario {
    private long id;
    private String nombre;
    private String email;
    private String contrasenia;
    private MediatorLogin mediador;

    public Usuario(long id, String nombre, String email, String contrasenia){
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contrasenia = contrasenia;
    }

    public long getId(){
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
            this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
