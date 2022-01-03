package Structural.Bridge.keys;

import Structural.Bridge.cars.Car;

public class BasicKey implements Key{
    protected Car car;

    public BasicKey(){

    }

    public BasicKey(Car car){
        this.car = car;
    }
    @Override
    public void power() {
        System.out.println("Key: engine toggle");
        if (car.isEngineStarted()) {
            car.start();
        } else {
            car.stop();
        }
    }

    @Override
    public void setTransmission() {
        if(car.getTransmission() == 'P') {
            System.out.println("Key: setting transmission on Drive");
            car.setTransmission('D');
        }
        else if (car.getTransmission() == 'D') {
            System.out.println("Key: setting transmission on Revers");
            car.setTransmission('R');
        }
        else {
            System.out.println("Key: setting transmission on Parking");
            car.setTransmission('P');
        }
    }

    @Override
    public void setFuelTankFullness() {
        System.out.println("Key: fueling the fuel tank with 10 liters of gasoline");
        car.setFuelTankFullness(car.getFuelTankFullness() + 10);
    }

    @Override
    public void ride() {
        System.out.println("Key: ride will cost 10 liters of gasoline");
        car.setFuelTankFullness(car.getFuelTankFullness() - 10);
    }
}
