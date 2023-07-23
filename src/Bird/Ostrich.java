package src.Bird;

import src.CanFly;

public class Ostrich extends Bird implements CanFly {
    public Ostrich(String kind, String name) {
        super(kind, name);
    }

    public void Fly() {
        System.out.println("The Kiwi can't fly");
    }
}
