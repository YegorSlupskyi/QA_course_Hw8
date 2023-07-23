package src.Pet;

import src.CanBeHunted;
import src.CanHunt;

public class Dog extends Pet implements CanHunt {
    public Dog(String name, String breed) {
        super(name, breed);
    }

    @Override
    public void HangAround() {
        System.out.println("Dog " + getName() + " is doing some shit hanging around...");
    }

    @Override
    public void Hunt(CanBeHunted victim) {
        System.out.println(getName() + " is pursuing " + victim.getVictimName() );
    }

    @Override
    public void makeSound() {
        System.out.println(getBreed() + " " + getName() + " is woofing...");
    }
}
