package com.excitingjava.designpatterns.observer.pullmodel;

/**
 * @author: Balogh Ádám Bence
 */
public class StockBroker implements Observer {
    private Subject subject;

    public StockBroker(Subject subject) {
        this.subject = subject;
        subject.register(this); //the observer registers itself
    }

    @Override
    public void update() {
        System.out.println("StockBroker has received an update.. StockBroker is going to check the ExicitingCorp's stock price");
        if(subject instanceof StockMarket){
            int excitingCorpStockPrice = ((StockMarket) subject).getExcitingCorpStockPrice();
            makeDecision(excitingCorpStockPrice);
        }
    }

    private void makeDecision(int excitingCorpStockPrice) {
        if (excitingCorpStockPrice > 150) {
            System.out.println("I'm selling my stocks and I'm gonna be rich");
            subject.unregister(this);
        } else if (excitingCorpStockPrice < 50) {
            System.out.println("I'm selling my stocks because I don't want to lose too much money");
            subject.unregister(this);
        }
    }
}
