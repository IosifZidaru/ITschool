package season4;

public class Memory {
    public static void main(String[] args) {

        String hello1 = "hello";
        String hello2 = "hello";
        String hello3 = new String( "Hello3");

        System.out.println( hello1 == hello2);

        System.out.println( hello1.equals( hello2 ) );

        System.out.println( hello2 == hello3);

        System.out.println( hello2.equals( hello3 ) );


    }
}
