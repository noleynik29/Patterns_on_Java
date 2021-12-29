package Creational.Builder.Buildings;

public class Garage {
    private String foundation;
    private String walls;
    private String doors;
    private String windows;
    private String roof;

    public Garage(String foundation, String walls, String doors, String windows, String roof){
        this.foundation = foundation;
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
        this.roof = roof;
    }

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

    public String getGarage(){
        String s = this.foundation + ", " + this.walls + ", " + this.doors + ", " + this.windows + ", " + this.roof + ".";
        return s;
    }
}
