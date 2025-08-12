package org.mobydigital.middleware.calendar;

import org.mobydigital.middleware.mediator.MediatorCalendar;

import java.time.LocalDateTime;

public class TareaGoogle {
    private MediatorCalendar mediador;
    private long id;
    private String titulo;
    private boolean estado;
    private String descripcion;
    private LocalDateTime fecha;

    public TareaGoogle(String titulo, boolean estado, String descripcion, LocalDateTime fecha) {
        this.setTitulo(titulo);
        this.setEstado(estado);
        this.setDescripcion(descripcion);
        this.setFecha(fecha);
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

    public String getDescripcion(){
        return this.descripcion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
