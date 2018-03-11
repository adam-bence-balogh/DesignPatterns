package com.excitingjava.designpatterns.observer.basics;

/**
 * @author: Balogh Ádám Bence
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new StockMarket();
        Observer obs1 = new StockBroker(subject);
        subject.notifyObservers(); //obs1 got an update
        subject.notifyObservers(); //obs1 got an update
        subject.unregister(obs1); //ob1 has been unregistered
        subject.notifyObservers(); //there's no one to notify
    }
}
