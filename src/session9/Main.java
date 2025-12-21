package session9;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Marcel", 30);
        Person p2 = new Person("Iosif", 21);

        System.out.println("voi printa numele lui p1: " + p1.getName());
        System.out.println("voi printa numele lui p 2: " + p2.name);

        p1.setName("Ale");
        System.out.println("voi printa numele lui p1: " + p1.getName());
        p2.setAge(20);
        p2.getDetails();
    }

}
