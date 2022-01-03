package Creational.Builder.Builders;

import Creational.Builder.Buildings.HouseType;

public interface Builder {
    void setHouseType(HouseType type);
    void buildFoundation(String foundation);
    void buildWalls(String walls);
    void buildDoors(String doors);
    void buildWindows(String windows);
    void buildRoof(String roof);

}
