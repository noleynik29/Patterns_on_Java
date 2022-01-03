package Creational.FactoryMethod.Factories;

import Creational.FactoryMethod.Interface.Transport;
import Creational.FactoryMethod.Products.Ship;

public class ShipCreator extends TransportCreator {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
