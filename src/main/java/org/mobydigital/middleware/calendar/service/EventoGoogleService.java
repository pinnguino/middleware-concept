package org.mobydigital.middleware.calendar.service;

import org.mobydigital.middleware.calendar.models.EventoGoogle;

import java.util.List;

public interface EventoGoogleService {
    public List<EventoGoogle> obtenerEventosUsuario();
}
