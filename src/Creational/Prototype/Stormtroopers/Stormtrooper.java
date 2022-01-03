package Creational.Prototype.Stormtroopers;

import java.util.Objects;

public abstract class Stormtrooper {
    public String armor;
    public String rank;

    public Stormtrooper(){

    }
    public Stormtrooper(Stormtrooper trooper){
        if(trooper != null){
            this.armor = trooper.armor;
            this.rank = trooper.rank;
        }
    }
    public abstract Stormtrooper clone();

    @Override
    public boolean equals(Object object2){
        if(!(object2 instanceof Stormtrooper)) return false;
        Stormtrooper stormtrooper2 = (Stormtrooper) object2;
        return Objects.equals(stormtrooper2.armor, armor) && Objects.equals(stormtrooper2.rank, rank);
    }
}
