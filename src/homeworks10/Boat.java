package homeworks10;

public class Boat {

    protected double lenght;
    protected double weight;

    public Boat(double lenght, double weight) {
        this.lenght = lenght;
        this.weight = weight;
    }

    public Boat() {
    }

    public void sail(){
        System.out.println("The boat is sailing");
    }

}
 class SpeedBoat extends Boat {

    private int maxSpeed;
    private String engineType;

     public SpeedBoat(double lenght, double weight, int maxSpeed, String engineType) {
         super(lenght, weight);
         this.maxSpeed = maxSpeed;
         this.engineType = engineType;
     }

     public void turboBoat(){
         System.out.println("TUrrbo boat activated! Max speed: " + maxSpeed + "km/h");
     }
 }
class FinishBoat extends Boat{

    private int fishCapacity;
    private String typeOfNet;

    public FinishBoat(double lenght, double weight, int fishCapacity, String typeOfNet){

    super(lenght, weight);
    this.fishCapacity = fishCapacity;
    this.typeOfNet = typeOfNet;
    }

    public void casNet(){
        System.out.println("Casting net of type: " + typeOfNet + "With capacity: " + fishCapacity);
    }
}

class TEstHierarchical{
    public static void main(String[] args) {

        SpeedBoat speedBoat = new SpeedBoat(6.5, 1200, 90, "V8");
        FinishBoat finishBoat =  new FinishBoat(8.0, 2000, 500, "Trawl");

        speedBoat.sail();
        speedBoat.turboBoat();

        finishBoat.sail();
        finishBoat.casNet();
    }
}
