package org.mobydigital.middleware.calendar.mediator;

public interface Mediator {
    public void notify(Object sender, String event) throws IllegalAccessException;
}
