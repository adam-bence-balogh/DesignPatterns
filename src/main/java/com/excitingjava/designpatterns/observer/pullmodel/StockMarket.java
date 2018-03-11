package com.excitingjava.designpatterns.observer.pullmodel;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author: Balogh Ádám Bence
 */
public class StockMarket implements Subject {
    private List<Observer> observerList = new CopyOnWriteArrayList<>();
    private int excitingCorpStockPrice = 100;

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
        System.out.println("Register observer");
    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
        System.out.println("Unregister observer");
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(obs -> obs.update());
    }

    public void changeExcitingCorpStockPrice(int amount){
        excitingCorpStockPrice += amount;
        notifyObservers();
    }

    public int getExcitingCorpStockPrice() {
        return excitingCorpStockPrice;
    }
}
