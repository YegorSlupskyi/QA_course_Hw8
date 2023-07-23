package src.Fish;

import src.CanSwim;

public abstract class Fish implements CanSwim {
    private String name;

    public Fish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void Swim() {
        System.out.println("The fish " + name + " is swimming...");
    }
}

