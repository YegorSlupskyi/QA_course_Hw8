package src.Bird;

import src.CanBeHunted;
import src.CanFly;

public class Pigeon extends Bird implements CanFly, CanBeHunted {
    public Pigeon (String kind, String name){
        super(kind, name);
    }

    @Override
    public void Fly() {
        System.out.println("The bird" + getKind() + " " + getName() + " is flying with wings");
    }

    @Override
    public String getVictimName() {
        return "Pigeon " + getName();
    }

    @Override
    public void Hide() {
        System.out.println("The Pigeon is trying to fly away...");
    }
}
