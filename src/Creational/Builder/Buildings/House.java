package Creational.Builder.Buildings;

public class House {
    private HouseType type;
    private String foundation;
    private String walls;
    private String doors;
    private String windows;
    private String roof;

    public House(HouseType type, String foundation, String walls, String doors, String windows, String roof){
        this.type = type;
        this.foundation = foundation;
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
        this.roof = roof;
    }

    public HouseType getType() { return type; }

    public String getFoundation() {
        return foundation;
    }

    public String getWalls() {
        return walls;
    }

    public String getDoors() {
        return doors;
    }

    public String getWindows() {
        return windows;
    }

    public String getRoof() {
        return roof;
    }
}
