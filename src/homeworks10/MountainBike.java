package homeworks10;

public class MountainBike extends Bicycle{
    
    private String tireType;
    private String suspension;

    public MountainBike(String tireType, String suspension){
        this.tireType = tireType;
        this.suspension = suspension;
    }
    public void adjustSuspension(){
        System.out.println("Suspension adjusted: " +suspension);
    }
}


