package Creational.Builder.Director;

import Creational.Builder.Builders.Builder;
import Creational.Builder.Buildings.HouseType;

public class Director {
    public void constructHouse(Builder builder){
        builder.setHouseType(HouseType.HOUSE);
        builder.buildFoundation("House foundation");
        builder.buildWalls("House walls");
        builder.buildDoors("House doors");
        builder.buildWalls("House walls");
        builder.buildWindows("House windows");
        builder.buildRoof("House roof");
    }
    public void constructMansion(Builder builder){
        builder.setHouseType(HouseType.MANSION);
        builder.buildFoundation("Mansion foundation");
        builder.buildWalls("Mansion walls");
        builder.buildDoors("Mansion doors");
        builder.buildWalls("Mansion walls");
        builder.buildWindows("Mansion windows");
        builder.buildRoof("Mansion roof");
    }
    public void constructVilla(Builder builder){
        builder.setHouseType(HouseType.VILLA);
        builder.buildFoundation("Villa foundation");
        builder.buildWalls("Villa walls");
        builder.buildDoors("Villa doors");
        builder.buildWalls("Villa walls");
        builder.buildWindows("Villa windows");
        builder.buildRoof("Villa roof");
    }
    public void constructManor(Builder builder){
        builder.setHouseType(HouseType.MANOR);
        builder.buildFoundation("Manor foundation");
        builder.buildWalls("Manor walls");
        builder.buildDoors("Manor doors");
        builder.buildWalls("Manor walls");
        builder.buildWindows("Manor windows");
        builder.buildRoof("Manor roof");
    }
    public void constructGarage(Builder builder){
        builder.buildFoundation("Garage foundation");
        builder.buildWalls("Garage walls");
        builder.buildDoors("Garage doors");
        builder.buildWalls("Garage walls");
        builder.buildWindows("Garage windows");
        builder.buildRoof("Garage roof");
    }
}
