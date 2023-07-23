package src.Pet;

import src.CanBeHunted;
import src.CanHunt;

public class Cat extends Pet implements CanHunt, CanBeHunted {

    public Cat(String name, String breed) {
        super(name, breed);
    }

    @Override
    public void Hunt(CanBeHunted victim) {
        System.out.println("The " + getBreed() + " " + getName() + " is pursuing " + victim.getVictimName());
    }

    @Override
    public String getVictimName() {
        return "Cat" + getName();
    }

    @Override
    public void Hide() {
        System.out.println("The Cat " + getName() + " is trying to hide on the tree...");
    }

    @Override
    public void makeSound() {
        System.out.println(getBreed() + " " + getName() + " is meowing...");
    }

    @Override
    public void HangAround() {

    }
}
