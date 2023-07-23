package src.EarthTransport;

import src.CanBeDriven;
import src.CanFly;

public abstract class EarthTransport implements CanBeDriven {
    private final String brand;
    private final String model;

    public EarthTransport(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
