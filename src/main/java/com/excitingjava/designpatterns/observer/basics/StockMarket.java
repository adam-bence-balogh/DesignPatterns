package com.excitingjava.designpatterns.observer.basics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Balogh Ádám Bence
 */
public class StockMarket implements Subject {
    private List<Observer> observerList = new ArrayList<>();
    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(obs -> obs.update());
    }
}
