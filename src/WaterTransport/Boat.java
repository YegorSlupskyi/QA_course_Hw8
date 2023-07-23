package src.WaterTransport;

public class Boat extends WaterTransport{
    public Boat (String model){
        super(model);
    }

    @Override
    public void Swim() {
        System.out.println("The Motor Boat " + getModel() + " is floating on the lake...");
    }

    @Override
    public void IsDrivenBy() {
        System.out.println("The Boat " + getModel() + " is driving by a boatman...");
    }
}
