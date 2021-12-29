package Structural.Bridge;

import Structural.Bridge.cars.Car;
import Structural.Bridge.cars.Sedan;
import Structural.Bridge.cars.SportsCar;
import Structural.Bridge.keys.AdvancedKey;
import Structural.Bridge.keys.BasicKey;

public class Main {
    public static void main(String[] args) {
        testCar(new Sedan());
        testCar(new SportsCar());
    }

    public static void testCar(Car car){
        System.out.println("Tests with basic key.");
        BasicKey basicKey = new BasicKey(car);
        basicKey.power();
        car.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedKey advancedKey = new AdvancedKey(car);
        advancedKey.power();
        advancedKey.fullFuelTank();
        advancedKey.setTransmission();
        car.printStatus();
    }
}
