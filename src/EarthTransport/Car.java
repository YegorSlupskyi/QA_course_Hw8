package src.EarthTransport;

public class Car extends EarthTransport {
    public Car(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void IsDrivenBy() {
        System.out.println("The Car " + getBrand() + " " + getModel() + " is driving by a Licenced driver...");
    }
}
