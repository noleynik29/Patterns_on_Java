package Creational.Prototype;

import Creational.Prototype.Stormtroopers.JediStormtrooper;
import Creational.Prototype.Stormtroopers.ShootingStormtrooper;
import Creational.Prototype.Stormtroopers.Stormtrooper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Stormtrooper> stormtroopers = new ArrayList<>();
        List<Stormtrooper> stormtroopersCopy = new ArrayList<>();

        ShootingStormtrooper shootingStormtrooper = new ShootingStormtrooper();
        shootingStormtrooper.armor = "White";
        shootingStormtrooper.blaster = "DC-15A";
        shootingStormtrooper.rank = "Clone-soldier";
        stormtroopers.add(shootingStormtrooper);

        ShootingStormtrooper anotherShootingStormtrooper = (ShootingStormtrooper) shootingStormtrooper.clone();
        stormtroopers.add(anotherShootingStormtrooper);

        JediStormtrooper jediStormtrooper = new JediStormtrooper();
        jediStormtrooper.armor = "Silver";
        jediStormtrooper.lightSaber = "Red";
        jediStormtrooper.rank = "Clone-commander";
        stormtroopers.add(jediStormtrooper);

        cloneAndCompare(stormtroopers, stormtroopersCopy);
    }
    private static void cloneAndCompare(List<Stormtrooper> stormtroopers, List<Stormtrooper> stormtroopersCopy) {
        for (Stormtrooper stormtrooper : stormtroopers) {
            stormtroopersCopy.add(stormtrooper.clone());
        }

        for (int i = 0; i < stormtroopers.size(); i++) {
            if (stormtroopers.get(i) != stormtroopersCopy.get(i)) {
                System.out.println(i + ": Stormtroopers are different objects (yay!)");
                if (stormtroopers.get(i).equals(stormtroopersCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Stormtrooper objects are the same (booo!)");
            }
        }
    }
}
