
interface PaymanetMetohde{
    void pay(double amount);
}

class CardPayment implements PaymanetMetohde{
    @Override
    public void pay(double amount){
        System.out.println("Paid: " + amount + " Using card");
    }
}

class CashPayment implements PaymanetMetohde{
    @Override
    public void pay(double amount){
        System.out.println("Paid: " + amount + "Using cash");
    }
}

class Order {
    private PaymanetMetohde paymanetMetohde;

    public Order(PaymanetMetohde paymanetMetohde){
        this.paymanetMetohde = paymanetMetohde;
    }

    public void checkout(double amount) {
        paymanetMetohde.pay(amount);
    }
}

abstract class User {
    protected String name;

    public void Super(){}

    public User (String name) {
        this.name = name;
    }

    abstract void getRole();

    public String getName(){
        return name;
    }

    public static void printSomething(){
        System.out.println("something static");
    }

}

class Admin extends User {

    public Admin(String name){
        super(name);
    }

    @Override
    public void getRole(){
        System.out.println("Admin user");
    }

    public void newFeature(){
        System.out.println("New feature");
    }

}


public class RecapOOP {
    public static void main(String[] args) {
        PaymanetMetohde payment = new CardPayment();
        Order order = new Order(payment);
        order.checkout(50);


        User user = new Admin("Iosif");
        user.getRole();
        String usserName = user.getName();
        System.out.println("name of the user: " + usserName);
       // user.newFeature();

        Admin admin = new Admin("Ale");
        System.out.println(admin.getName());
        admin.getRole();
        admin.newFeature();
        Admin.printSomething();

    }
}



















