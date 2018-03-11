package com.excitingjava.designpatterns.observer.basics;

/**
 * @author: Balogh Ádám Bence
 */
public class StockBroker implements Observer {
    public StockBroker(Subject subject){
        subject.register(this); //the observer registers itself
    }
    @Override
    public void update() {
        System.out.println("I've just received an update.. I think I'm gonna check the market..");
    }
}
