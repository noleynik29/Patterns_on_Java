package Creational.Builder.Builders;

import Creational.Builder.Buildings.House;
import Creational.Builder.Buildings.HouseType;

public class HouseBuilder implements Builder{
    private HouseType type;
    private String foundation;
    private String walls;
    private String doors;
    private String windows;
    private String roof;

    public void setHouseType(HouseType type) {
        this.type = type;
    }

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

    public House getResult(){
        return new House(type, foundation, walls, doors, windows, roof);
    }
}
