package src.WaterTransport;

import src.CanBeDriven;
import src.CanSwim;

public abstract class WaterTransport implements CanSwim, CanBeDriven {
    private final String model;

    public WaterTransport(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
