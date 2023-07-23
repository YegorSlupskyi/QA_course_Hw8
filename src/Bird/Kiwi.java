package src.Bird;

import src.CanFly;

public class Kiwi extends Bird implements CanFly {
    public Kiwi(String kind, String name) {
        super(kind, name);
    }

    public void Fly() {
        System.out.println("The Kiwi can't fly");
    }
}

