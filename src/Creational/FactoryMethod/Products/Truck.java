package Creational.FactoryMethod.Products;

import Creational.FactoryMethod.Interface.Transport;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Road delivering");
    }
}
