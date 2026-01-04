package homeworks10;

public class Wolf extends Animals{
    
    @Override
    public void sound(){
        System.out.println("how");
    }
}

class TestAbimals{

    public static void main(String[] args) {
        Animals dog = new Dog();
        Animals cat = new Cat();
        Animals wolf = new Wolf();

        dog.sound();
        cat.sound();
        wolf.sound();
    }
}

