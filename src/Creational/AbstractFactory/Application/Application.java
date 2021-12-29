package Creational.AbstractFactory.Application;

import Creational.AbstractFactory.Interfaces.Chair;
import Creational.AbstractFactory.Interfaces.FurnitureFactory;
import Creational.AbstractFactory.Interfaces.Table;

public class Application {
    private Chair chair;
    private Table table;

    public Application(FurnitureFactory factory){
        chair = factory.createChair();
        table = factory.createTable();
    }

    public void place(){
        chair.place();
        table.place();
    }
}
