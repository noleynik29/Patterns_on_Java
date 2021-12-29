package Creational.AbstractFactory.Tables;

import Creational.AbstractFactory.Interfaces.Table;

public class ModernTable implements Table {
    @Override
    public void place() {
        System.out.println("I'm modern table! You can place things on me");
    }
}
