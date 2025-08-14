package org.mobydigital.middleware.middlewareCalendar.service;

import org.mobydigital.middleware.middlewareCalendar.calendar.EventoGoogle;

import java.util.List;

public interface EventoGoogleService {
    public List<EventoGoogle> obtenerEventosUsuario();
}
