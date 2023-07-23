package src.Bird;

import src.CanFly;

public class Stork extends Bird implements CanFly {
    public Stork(String kind, String name) {
        super(kind, name);
    }

    @Override
    public void Fly() {
        System.out.println("The bird" + getKind() + " " + getName() + " is flying with wings");
    }
}
