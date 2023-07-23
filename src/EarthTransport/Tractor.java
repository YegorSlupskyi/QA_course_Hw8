package src.EarthTransport;

public class Tractor extends EarthTransport{
    public Tractor(String brand, String model){
        super(brand, model);
    }

    @Override
    public void IsDrivenBy() {
        System.out.println("The Tractor " + getModel() + " is driving by a tractor driver...");
    }
}
