package src.AirTransport;

public class Balloon extends AirTransport{
    public Balloon (String model){
        super (model);
    }

    @Override
    public void Fly() {
        System.out.println("The Air Transport " + getModel() + " is flying with petrol");
    }

    @Override
    public void IsDrivenBy() {
        System.out.println("The Air Transport " + getModel() + " is driving by a Pilot...");
    }
}
