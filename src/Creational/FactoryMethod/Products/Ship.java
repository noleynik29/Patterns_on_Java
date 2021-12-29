package Creational.FactoryMethod.Products;

import Creational.FactoryMethod.Interface.Transport;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Sea delivering");
    }
}
