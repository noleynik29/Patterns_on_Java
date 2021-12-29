package Creational.AbstractFactory.Factories;

import Creational.AbstractFactory.Chairs.VictorianChair;
import Creational.AbstractFactory.Interfaces.Chair;
import Creational.AbstractFactory.Interfaces.FurnitureFactory;
import Creational.AbstractFactory.Interfaces.Table;
import Creational.AbstractFactory.Tables.VictorianTable;

public class VictorianFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
