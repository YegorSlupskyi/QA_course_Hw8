package src.AirTransport;

import src.CanBeDriven;
import src.CanFly;

public abstract class AirTransport implements CanFly, CanBeDriven {
    private final String model;

    public AirTransport(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
