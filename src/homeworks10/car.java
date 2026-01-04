package homeworks10;

public class car {

    protected String make;
    protected String model;
    protected int year;

    public void start(){
        System.out.println("Car started");
    }

    public void stop(){
        System.out.println("Car stopped");
    }

    public void accelerate(){
        System.out.println("Car is accelerating");
    }
}
class ElectricCar extends car {

    protected int batteryCapavity;
    protected int range;

    public void charge(){
        System.out.println("Electric care is charging");
    }
}
class Tesla extends ElectricCar  {

    public String autoPilotVersion;

    public Tesla(String autoPilotVersion){
        this.autoPilotVersion = autoPilotVersion;
    }

    public void enableAutopilot(){
        System.out.println("Auotpilot enable: " + autoPilotVersion);
    }
}

class TestMultimpleVersion{
    public static void main(String[] args) {

        Tesla car = new Tesla("v11,4");

        car.start();
        car.accelerate();
        car.enableAutopilot();
        car.stop();
    }
}
