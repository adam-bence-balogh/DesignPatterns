package com.excitingjava.designpatterns.templatemethod.wrestlingexample;

/**
 * @author: Balogh Ádám Bence
 */
public abstract class Wrestler {
    public void clothesline(){
        System.out.println("Clothesline");
    }
    public void bump(){
        System.out.println("Bump");
    }
    public abstract void finisher();
    public void wrestle(){
        clothesline();
        bump();
        finisher();
    }
}
