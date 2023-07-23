package src.Bird;

import src.CanBeHunted;
import src.CanFly;
import src.CanHunt;

public class Eagle extends Bird implements CanFly, CanHunt {
    public Eagle (String kind, String name){
        super(kind, name);
    }
    @Override
    public void Fly() {
        System.out.println("The " + getKind() + " " + getName() + " is flying with wings");
    }

    @Override
    public void Hunt(CanBeHunted victim) {
        System.out.println("The Eagle's pursuing the " + victim.getVictimName() + "...");
    }
}
