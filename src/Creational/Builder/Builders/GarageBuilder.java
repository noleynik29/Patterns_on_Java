package Creational.Builder.Builders;

import Creational.Builder.Buildings.Garage;
import Creational.Builder.Buildings.HouseType;

public class GarageBuilder implements Builder{
    private HouseType type;
    private String foundation;
    private String walls;
    private String doors;
    private String windows;
    private String roof;

    @Override
    public void setHouseType(HouseType type) { this.type = type; }

    @Override
    public void buildFoundation(String foundation) {
        this.foundation = foundation;
    }

    @Override
    public void buildWalls(String walls) {
        this.walls = walls;
    }

    @Override
    public void buildDoors(String doors) {
        this.doors = doors;
    }

    @Override
    public void buildWindows(String windows) {
        this.windows = windows;
    }

    @Override
    public void buildRoof(String roof) {
        this.roof = roof;
    }

    public Garage getResult(){
        return new Garage(foundation, walls, doors, windows, roof);
    }
}
