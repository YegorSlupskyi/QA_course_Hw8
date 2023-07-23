package src.Bird;

import src.CanBeHunted;
import src.CanFly;
import src.CanHunt;
import src.CanSwim;

public class Penguin extends Bird implements CanSwim, CanFly {
    public Penguin(String kind, String name) {
        super(kind, name);
    }

    public void Fly() {
        System.out.println("The Penguin can't fly");
    }

    public void Swim() {
        System.out.println("The " + getKind() + " " + getName() + " is swimming in the sea");
    }
}
