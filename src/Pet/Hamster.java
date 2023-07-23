package src.Pet;

import src.CanBeHunted;

public class Hamster extends Pet implements CanBeHunted {
    public Hamster(String name, String breed) {
        super(name, breed);
    }

    @Override
    public void makeSound() {
        System.out.println(getBreed() + " " + getName() + " is silent animal...");
    }

    @Override
    public void HangAround() {
        System.out.println("Hamster " + getName() + "is walking around the cage ...");
    }

    @Override
    public String getVictimName() {
        return "Hamster " + getName();
    }

    @Override
    public void Hide() {
        System.out.println("The Hamster is trying to hide in cage...");
    }
}
