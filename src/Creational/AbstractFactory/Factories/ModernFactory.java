package Creational.AbstractFactory.Factories;

import Creational.AbstractFactory.Chairs.ModernChair;
import Creational.AbstractFactory.Interfaces.Chair;
import Creational.AbstractFactory.Interfaces.FurnitureFactory;
import Creational.AbstractFactory.Interfaces.Table;
import Creational.AbstractFactory.Tables.ModernTable;

public class ModernFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
