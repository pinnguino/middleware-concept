package org.mobydigital.middleware.service;

import org.mobydigital.middleware.calendar.EventoGoogle;

import java.util.List;

public interface EventoGoogleService {
    public List<EventoGoogle> obtenerEventosUsuario();
}
