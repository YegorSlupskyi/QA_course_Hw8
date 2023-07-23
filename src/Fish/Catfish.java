
package src.Fish;

import src.CanBeHunted;
import src.CanHunt;

public class Catfish extends Fish implements CanHunt {
    public Catfish(String name) {
        super(name);
    }

    @Override
    public void Swim() {
        System.out.println("The Catfish " + getName() + " is swimming...");
    }

    public void Hunt (CanBeHunted victim){
        System.out.println("The Pike's looking for the " + victim.getVictimName() + "..." );
    }
}



