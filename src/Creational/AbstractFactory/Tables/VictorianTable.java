package Creational.AbstractFactory.Tables;

import Creational.AbstractFactory.Interfaces.Table;

public class VictorianTable implements Table {
    @Override
    public void place() {
        System.out.println("I'm victorian table! You can place things on me");
    }
}
