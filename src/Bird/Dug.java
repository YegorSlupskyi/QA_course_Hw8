package src.Bird;

import src.CanBeHunted;
import src.CanFly;
import src.CanSwim;

public class Dug extends Bird implements CanFly, CanSwim, CanBeHunted {
    public Dug (String kind, String name){
        super(kind, name);
    }

    @Override
    public void Fly() {
        System.out.println("The bird" + getKind() + " " + getName() + " is flying with wings");
    }

    @Override
    public void Swim() {
        System.out.println("The Dug is swimming in the lake...");
    }

    @Override
    public String getVictimName() {
        return "Dug " + getName();
    }

    @Override
    public void Hide() {
        System.out.println("The Dug is trying to fly away...");
    }
}
