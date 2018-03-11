package com.excitingjava.designpatterns.observer.basics;

/**
 * @author: Balogh Ádám Bence
 */
public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
}
