package homeworks;
import java.lang.reflect.Array;
import java.net.PasswordAuthentication;
import java.util.ArrayList;

public class season2 {
    public static void main(String[] args) {

        int temperature = 25;
        if (temperature > 30) {
            System.out.println("Hot");
        } else if (temperature >= 20) {
            System.out.println("Warm");
        } else {
            System.out.println(" Cold");
        }

        int number = 5;
        int factorial = 1;

        for ( int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + "is:" + factorial);


        String countyOne = "USA";
        String countryTwo = "USA";

        System.out.println("Before change, equal?" + countyOne.equals(countryTwo) );

        // Change value of contryTwo
        countryTwo = "UK";
        System.out.println("After change, equal?" + countyOne.equals(countryTwo) );


        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("Apple");
        listOne.add("Banana");

        // listTwo refera la acealsi obiect ca listOne
        ArrayList<String> listTwo = listOne;

        // Modificam listOne
        listOne.add("Orange");

        System.out.println("listOne: " + listOne);
        System.out.println("ListTwo " + listTwo);


        int a = 10, b =20, c =30, d =40;
        int addetionResult = a + b;

        int additionResult = a + b;
        int multiplicatiionResult = c * d;

        System.out.println("adeitionResult= " + addetionResult);
        System.out.println("multiplicationresult = " + multiplicatiionResult);

        int Number = 25;
        int negativeNumber = -number;

        System.out.println("number = " + number);
        System.out.println("negativeNumber = " + negativeNumber);

        boolean isRaining = true;
        boolean isSunny = false;

        isRaining = !isRaining;
        isSunny = !isSunny;
        System.out.println("isRainning =  " + isRaining);
        System.out.println(" is sunny  = " + isSunny);


        int couter = 0;
        couter++; // increment
        System.out.println("after icrement:" + couter);

        couter--; //decrement;
        System.out.println("after decremeny:" + couter);


        int total = 100;

        total -=20; // scadere cu 20
        System.out.println("after subtracting 20: " + total);
         total *= 2;// inmultirea cu 2
        System.out.println("After multiplying by 2: " + total);

        int number1 = 50;

        number1 = -number1; // negare
        System.out.println("After negatiom: " + number1);

        number1 = Math.abs(number1); // valoarea absoluta
        System.out.println("After absolute value: " + number1);

        number1++; // incrementare
        System.out.println("After incrementing: " + number1);

    }
}
