package org.mobydigital.middleware.calendar.models;

import org.mobydigital.middleware.calendar.mediator.MediatorCalendar;

import java.time.LocalDateTime;

public class EventoGoogle {
    private long id;
    private MediatorCalendar mediador;
    private String titulo;
    private String descripcion;
    private LocalDateTime fecha;

    public EventoGoogle(long id, String titulo, String descripcion, LocalDateTime fecha) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
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