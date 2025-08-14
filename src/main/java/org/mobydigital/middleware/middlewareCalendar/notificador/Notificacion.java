package org.mobydigital.middleware.middlewareCalendar.notificador;

import org.mobydigital.middleware.middlewareCalendar.mediator.MediatorCalendar;

import java.time.LocalDateTime;

public class Notificacion {
    private long id;
    private MediatorCalendar mediador;
    private String titulo;
    private LocalDateTime fecha;
    private String descripcion;
    private boolean leida;

    public Notificacion(String titulo, LocalDateTime fecha, String descripcion, boolean leida) {
        this.setTitulo(titulo);
        this.setFecha(fecha);
        this.setDescripcion(descripcion);
        this.setLeida(leida);
    }

    public String notificarTexto(){
       return "*" + getTitulo() + " | " + getDescripcion() + " | " + getFecha();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isLeida() {
        return leida;
    }

    public void setLeida(boolean leida) {
        this.leida = leida;
    }
}
