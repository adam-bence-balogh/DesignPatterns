package com.excitingjava.designpatterns.observer.pushmodel;

/**
 * @author: Balogh Ádám Bence
 */
public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers(Object data);
}
