package org.mobydigital.middleware.service;

import org.mobydigital.middleware.calendar.EventoGoogle;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class EventoGoogleServiceImpl implements EventoGoogleService{
    public List<EventoGoogle> obtenerEventosUsuario(){
        return Arrays.asList(
                new EventoGoogle(1, "Fiesta de fin de año Moby", "Fiesta en BsAs", LocalDateTime.of(2024, 12,25,00,00)),
                new EventoGoogle(2, "Stream MobyDito", "Veni a compartir con nosotros!", LocalDateTime.of(2026, 8,11,11,06)),
                new EventoGoogle(3, "Bingo virtual", "Agarrá tus cartones!", LocalDateTime.of(2026, 11,24,12,30))
        );
    }
}
