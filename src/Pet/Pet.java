package src.Pet;

import src.HasVoice;

public abstract class Pet implements HasVoice {
    private final String name;
    private final String breed;

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public abstract void HangAround();
}
