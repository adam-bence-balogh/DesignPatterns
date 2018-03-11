package com.excitingjava.designpatterns.templatemethod.wrestlingexample;

/**
 * @author: Balogh Ádám Bence
 */
public class JohnCena extends Wrestler {
    @Override
    public void finisher(){
        System.out.println("You can't see mee, 5 knuckle shuffle");
    }
}
