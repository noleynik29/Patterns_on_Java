package Creational.AbstractFactory.Chairs;

import Creational.AbstractFactory.Interfaces.Chair;

public class ModernChair implements Chair {
    @Override
    public void place() {
        System.out.println("I'm modern chair! You can sit on me");
    }
}
