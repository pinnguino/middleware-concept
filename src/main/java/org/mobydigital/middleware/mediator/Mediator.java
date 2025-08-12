package org.mobydigital.middleware.mediator;

public interface Mediator {
    public String notify(Object sender, String event) throws IllegalAccessException;
}
