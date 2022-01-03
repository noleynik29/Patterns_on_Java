package Creational.FactoryMethod.Factories;

import Creational.FactoryMethod.Interface.Transport;

public abstract class TransportCreator {
    public void transportDelivering(){
        Transport transport = createTransport();
        transport.deliver();
    }
    public abstract Transport createTransport();
}
