package src.WaterTransport;

public class MotorBoat extends WaterTransport {
    public MotorBoat (String model){
        super(model);
    }

    @Override
    public void Swim() {
        System.out.println("The Motor Boat " + getModel() + " is floating on the lake...");
    }

    @Override
    public void IsDrivenBy() {
        System.out.println("The Motorboat " + getModel() + " is driving by a boatman...");
    }
}
