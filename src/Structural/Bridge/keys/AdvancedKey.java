package Structural.Bridge.keys;

import Structural.Bridge.cars.Car;

public class AdvancedKey extends BasicKey{
    public AdvancedKey (Car car){
        super.car = car;
    }

    public void fullFuelTank(){
        System.out.println("Key: fuel tank is full");
        car.setFuelTankFullness(80);
    }
}
