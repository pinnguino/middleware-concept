package org.mobydigital.middleware.service;

import org.mobydigital.middleware.calendar.EventoGoogle;

import java.util.Arrays;
import java.util.List;

public class EventoGoogleServiceImpl implements EventoGoogleService{
    public List<EventoGoogle> obtenerEventosUsuario(){
        return Arrays.asList(
                new EventoGoogle("Evento 1", "asdasdsa1"),
                new EventoGoogle("Evento 2", "adsadas2"),
                new EventoGoogle("Evento 3", "sdasdas3")
        );
    }
}
