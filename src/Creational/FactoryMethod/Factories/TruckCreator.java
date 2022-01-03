package Creational.FactoryMethod.Factories;

import Creational.FactoryMethod.Interface.Transport;
import Creational.FactoryMethod.Products.Truck;

public class TruckCreator extends TransportCreator {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
