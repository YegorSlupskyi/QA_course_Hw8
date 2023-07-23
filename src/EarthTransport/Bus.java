package src.EarthTransport;

public class Bus extends EarthTransport{
    public Bus(String brand, String model){
        super(brand, model);
    }

    @Override
    public void IsDrivenBy() {
        System.out.println("The Bus " + getModel() + " is driving by a Licenced driver...");
    }
}
