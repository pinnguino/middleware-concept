package org.mobydigital.middleware.notificador;

import org.mobydigital.middleware.mediator.MediatorCalendar;

public class Notificacion {
    //private long id;
    private MediatorCalendar mediador;
    private String titulo;
    //private Date fecha;
    //private String descripcion;
    //private boolean leida;

    public Notificacion(String titulo) {
        this.titulo = titulo;
    }

    public String notificarTexto(){
       return titulo;
    }
}
