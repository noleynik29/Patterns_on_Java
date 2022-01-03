package Creational.Prototype.Stormtroopers;

public class ShootingStormtrooper extends Stormtrooper {
    public String blaster;

    public ShootingStormtrooper(){

    }

    public ShootingStormtrooper(ShootingStormtrooper trooper){
        super(trooper);
        if(trooper != null){
            this.blaster = trooper.blaster;
        }
    }

    @Override
    public Stormtrooper clone() {
        return new ShootingStormtrooper(this);
    }

    @Override
    public boolean equals(Object object2){
        if (!(object2 instanceof ShootingStormtrooper) || !super.equals(object2)) return false;
        ShootingStormtrooper stormtrooper2 = (ShootingStormtrooper) object2;
        return stormtrooper2.blaster.equals(blaster);
    }
}
