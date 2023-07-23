package src.WaterTransport;

public class Barge extends WaterTransport{
    public Barge (String model){
        super(model);
    }

    @Override
    public void Swim() {
        System.out.println("The Motor Boat " + getModel() + " is floating on the lake...");
    }

    @Override
    public void IsDrivenBy() {
        System.out.println("The Barge " + getModel() + " is driving by a boatman...");
    }
}
