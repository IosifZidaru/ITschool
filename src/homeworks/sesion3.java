package homeworks;

public class sesion3 {
    public static void main(String[] args) {

        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";

        if ( stringOne == stringTwo){
            System.out.println( "stringOne si stringTwo se refera la acelasi obiect");
        } else {
            System.out.println(" stringOne si stringTwo NU se refera la acelasi obiect");
        }

        int firstNumber = 10;
        int secoundNumber = 10;
        System.out.println( " numerele sunt egale?" + (firstNumber == secoundNumber ) );
        String firstString = new String( " OpenAI");
        String secondString = new String("OpenAI");

        System.out.println("Stringurile sunt egale ?" + firstString.equals(secondString) );


        int age = 20;
        if ( age >= 18){
            System.out.println("sunt adult ");
        } else {
            System.out.println( " nu sunt un adult");

            


        }
    }
}
