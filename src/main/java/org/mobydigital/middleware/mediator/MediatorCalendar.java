package org.mobydigital.middleware.mediator;

import org.mobydigital.middleware.calendar.EventoGoogle;
import org.mobydigital.middleware.calendar.TareaGoogle;
import org.mobydigital.middleware.notificador.Notificacion;
import org.mobydigital.middleware.service.EventoGoogleService;
import org.mobydigital.middleware.service.EventoGoogleServiceImpl;
import org.mobydigital.middleware.service.TareaGoogleService;
import org.mobydigital.middleware.service.TareaGoogleServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class MediatorCalendar implements Mediator {

    private List<EventoGoogle> eventos;
    private List<TareaGoogle> tareas;
    private Notificacion notificacion;

    public MediatorCalendar() {
        EventoGoogleService s1 = new EventoGoogleServiceImpl();
        TareaGoogleService s2 = new TareaGoogleServiceImpl();
        List<TareaGoogle> tareas = s2.listarTareasUsuario();
        List<EventoGoogle> eventos = s1.obtenerEventosUsuario();

        for(TareaGoogle t : tareas) {
            t.setMediador(this);
        }
        for(EventoGoogle e : eventos) {
            e.setMediador(this);
        }
        this.eventos = eventos;
        this.tareas = tareas;
    }

    @Override
    public String notify(Object sender, String event) {
        // Conexion entre tarea y notificacion (notificar de una tarea)
        if((sender instanceof TareaGoogle) && (event.equals("notificarEvento"))) {
            TareaGoogle t = (TareaGoogle)sender;
            notificacion = new Notificacion(t.getTitulo());
            return notificacion.notificarTexto();
        }
        return null;
    }

    public List<TareaGoogle> listarSinHacer() {
        List<TareaGoogle> sinHacer = new ArrayList<>();
        for(TareaGoogle t : tareas) {
            if (!t.isEstado()){
                sinHacer.add(t);
            }
        }
        return sinHacer;
    }

    public List<EventoGoogle> getEventos() {
        return eventos;
    }

    public void setEventos(List<EventoGoogle> eventos) {
        this.eventos = eventos;
    }

    public List<TareaGoogle> getTareas() {
        return tareas;
    }

    public void setTareas(List<TareaGoogle> tareas) {
        this.tareas = tareas;
    }

    public Notificacion getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

}
