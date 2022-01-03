package Creational.FactoryMethod;

import Creational.FactoryMethod.Factories.ShipCreator;
import Creational.FactoryMethod.Factories.TransportCreator;
import Creational.FactoryMethod.Factories.TruckCreator;
import java.util.Scanner;

public class Main {
    private static TransportCreator transportCreator;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to create Truck or Ship?");
        String transport = in.nextLine();
        configure(transport);
        runTransportLogic();
        in.close();
    }
    static void configure(String transport){
        if (transport.equals("Truck")){
            transportCreator = new TruckCreator();
        }
        else {
            transportCreator = new ShipCreator();
        }
    }

    static void runTransportLogic() {
        transportCreator.transportDelivering();
    }
}
