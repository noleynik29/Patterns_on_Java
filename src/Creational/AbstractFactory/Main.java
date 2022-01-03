package Creational.AbstractFactory;

import Creational.AbstractFactory.Application.Application;
import Creational.AbstractFactory.Factories.ModernFactory;
import Creational.AbstractFactory.Factories.VictorianFactory;
import Creational.AbstractFactory.Interfaces.FurnitureFactory;

import java.util.Scanner;

public class Main {
    private static Application configure(String furniture){
        Application app;
        FurnitureFactory factory;
        if (furniture.equals("Victorian")){
            factory = new VictorianFactory();
            app = new Application(factory);
        }else {
            factory = new ModernFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("In which style do you want buy furniture - Modern or Victorian?");
        String furniture = in.nextLine();
        Application app = configure(furniture);
        app.place();
        in.close();
    }
}
