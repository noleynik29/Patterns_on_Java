package Structural.Bridge.cars;

public interface Car {
    boolean isEngineStarted();

    void start();

    void stop();

    int getFuelTankFullness();

    void setFuelTankFullness(int liter);

    char getTransmission();

    void setTransmission(char transmission);

    void printStatus();
}
