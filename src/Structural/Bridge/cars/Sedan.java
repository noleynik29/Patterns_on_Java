package Structural.Bridge.cars;

public class Sedan implements Car{
    private boolean on = false;
    private int liter = 0;
    private char transmission = 'P';


    @Override
    public boolean isEngineStarted() {
        return on;
    }

    @Override
    public void start() {
        this.on = true;
    }

    @Override
    public void stop() {
        this.on = false;
    }

    @Override
    public int getFuelTankFullness() {
        return this.liter;
    }

    @Override
    public void setFuelTankFullness(int liter) {
        if(liter > 80){
            this.liter = 80;
        } else if (liter < 0) {
            this.liter = 0;
        } else {
            this.liter = liter;
        }
    }

    @Override
    public char getTransmission() {
        return transmission;
    }

    @Override
    public void setTransmission(char transmission) {
        if (transmission == 'R'){
            this.transmission = transmission;
        }
        else if (transmission == 'D'){
            this.transmission = transmission;
        }
        else {
            this.transmission = 'P';
        }
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm sportcar.");
        System.out.println("| My engine is " + (this.on ? "started" : "stopped"));
        System.out.println("| Current fuel tank fullness is " + this.liter + " liters");
        System.out.println("| Current transmission is " + this.transmission);
        System.out.println("------------------------------------\n");
    }
}
