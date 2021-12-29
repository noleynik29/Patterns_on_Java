package Creational.Prototype.Stormtroopers;

public class JediStormtrooper extends Stormtrooper {
    public String lightSaber;

    public JediStormtrooper(){

    }

    public JediStormtrooper(JediStormtrooper trooper){
        super(trooper);
        if(trooper != null){
            this.lightSaber = trooper.lightSaber;
        }
    }

    @Override
    public Stormtrooper clone() {
        return new JediStormtrooper(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof JediStormtrooper) || !super.equals(object2)) return false;
        JediStormtrooper stormtrooper2 = (JediStormtrooper) object2;
        return stormtrooper2.lightSaber.equals(lightSaber);
    }
}
