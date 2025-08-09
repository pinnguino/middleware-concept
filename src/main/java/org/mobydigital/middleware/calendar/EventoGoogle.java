package org.mobydigital.middleware.calendar;

import org.mobydigital.middleware.mediator.MediatorCalendar;

public class EventoGoogle {
    private MediatorCalendar mediador;
  //  private long id;
   // private Date fecha;
    private String titulo;
    private String descripcion;
//    private String tipo;

    public EventoGoogle(String titulo, String descripcion) {
        //this.mediador = mediador;
        this.titulo = titulo;
        this.descripcion = descripcion;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}