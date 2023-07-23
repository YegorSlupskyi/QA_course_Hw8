package src.Bird;

import src.CanFly;

public abstract class Bird {
    private final String kind;
    private final String name;

    public Bird(String kind, String name) {
        this.kind = kind;
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public String getName() {
        return name;
    }

}
