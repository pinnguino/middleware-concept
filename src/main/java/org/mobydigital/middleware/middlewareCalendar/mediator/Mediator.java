package org.mobydigital.middleware.middlewareCalendar.mediator;

public interface Mediator {
    public void notify(Object sender, String event) throws IllegalAccessException;
}
