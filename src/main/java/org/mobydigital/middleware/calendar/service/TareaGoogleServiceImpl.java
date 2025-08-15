package org.mobydigital.middleware.calendar.service;

import org.mobydigital.middleware.calendar.models.TareaGoogle;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class TareaGoogleServiceImpl implements TareaGoogleService{
    public List<TareaGoogle> listarTareasUsuario(){
        return Arrays.asList(
                new TareaGoogle("Tarea 1", false, "Descripcion:", LocalDateTime.now()),
                new TareaGoogle("Tarea 2", true, "Descripcion:", LocalDateTime.now()),
                new TareaGoogle("Tarea 3", false,"Descripcion:", LocalDateTime.now())
        );
    }
}
