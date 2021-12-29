package Creational.Builder;

import Creational.Builder.Builders.GarageBuilder;
import Creational.Builder.Builders.HouseBuilder;
import Creational.Builder.Buildings.Garage;
import Creational.Builder.Buildings.House;
import Creational.Builder.Director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        HouseBuilder houseBuilder = new HouseBuilder();
        director.constructHouse(houseBuilder);
        House house = houseBuilder.getResult();
        System.out.println("House built:\n" + house.getType());

        GarageBuilder garageBuilder = new GarageBuilder();
        director.constructGarage(garageBuilder);
        Garage garage = garageBuilder.getResult();
        System.out.println("\nGarage built:\n" + garage.getGarage());
    }
}
