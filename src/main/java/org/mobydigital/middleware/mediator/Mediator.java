package org.mobydigital.middleware.mediator;

public interface Mediator {
    public void notify(Object sender, String event) throws IllegalAccessException;
}
