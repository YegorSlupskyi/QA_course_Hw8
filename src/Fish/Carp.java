package src.Fish;

import src.CanBeHunted;

public class Carp extends Fish implements CanBeHunted {
    public Carp(String name) {
        super(name);
    }

    @Override
    public void Swim() {
        System.out.println("The carp " + getName() + " is swimming...");
    }

    public String getVictimName() {
        return "Carp " + getName();
    }

    public void Hide() {
        System.out.println("The Carp is trying to hide in the shallow water...");
    }
}
