package org.mobydigital.middleware.service;

import org.mobydigital.middleware.calendar.EventoGoogle;
import org.mobydigital.middleware.calendar.TareaGoogle;

import java.util.Arrays;
import java.util.List;

public class TareaGoogleServiceImpl implements TareaGoogleService{
    public List<TareaGoogle> listarTareasUsuario(){
        return Arrays.asList(
                new TareaGoogle("Tarea 1", false),
                new TareaGoogle("Tarea 2", true),
                new TareaGoogle("Tarea 3", false)
        );
    }
}
