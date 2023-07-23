package src.Fish;

import src.CanBeHunted;
import src.CanHunt;

public class Pike extends Fish implements CanHunt {
    public Pike(String name) {
        super(name);
    }

    public void Swim() {
        System.out.println("The Pike " + getName() + " is swimming...");
    }

    @Override
    public void Hunt(CanBeHunted victim) {
        System.out.println("The Pike's pursuing the " + victim.getVictimName());
    }
}
