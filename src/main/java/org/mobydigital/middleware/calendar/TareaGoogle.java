package org.mobydigital.middleware.calendar;

import org.mobydigital.middleware.mediator.MediatorCalendar;

public class TareaGoogle {
    private MediatorCalendar mediador;
    private long id;
    private String titulo;
    private boolean estado;
//    private String descripcion;

    public TareaGoogle(String titulo, boolean estado) {
        this.titulo = titulo;
        this.estado = estado;
    }

    public MediatorCalendar getMediador() {
        return mediador;
    }

    public void setMediador(MediatorCalendar mediador) {

        this.mediador = mediador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
