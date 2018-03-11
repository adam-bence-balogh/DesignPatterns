package com.excitingjava.designpatterns.observer.pullmodel;



/**
 * @author: Balogh Ádám Bence
 */
public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        Observer stockBroker = new StockBroker(stockMarket);
        stockMarket.changeExcitingCorpStockPrice(20);
        stockMarket.changeExcitingCorpStockPrice(20);
        stockMarket.changeExcitingCorpStockPrice(20);
        stockMarket.changeExcitingCorpStockPrice(20);
        stockMarket.changeExcitingCorpStockPrice(20);
    }
}
