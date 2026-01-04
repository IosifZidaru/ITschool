package homeworks10;

public class Bicycle {

    protected int speed;
    protected int gear;

    public void changeGear(int newGear){
        gear = newGear;
        System.out.println("Gear change to: " + gear);
    }

    public void speedUp(int increment){
        speed += increment;
        System.out.println("Speed increased to: " + speed);
    }

    public void applyBrake(int decrement){
        speed -= decrement;
        System.out.println("Speed decreased to: " + speed);
    }
}

 class TestSingle{
    public static void main(String[] args) {

        MountainBike bike = new MountainBike("Off-road", "Full");

        bike.changeGear(3);
        bike.speedUp(20);
        bike.applyBrake(5);
        bike.adjustSuspension();
    }
}