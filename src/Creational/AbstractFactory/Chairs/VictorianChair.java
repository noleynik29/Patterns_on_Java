package Creational.AbstractFactory.Chairs;

import Creational.AbstractFactory.Interfaces.Chair;

public class VictorianChair implements Chair {
    @Override
    public void place() {
        System.out.println("I'm victorian chair! You can sit on me");
    }
}
