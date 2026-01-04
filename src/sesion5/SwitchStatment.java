package sesion5;


import java.util.Scanner;

import static java.util.Calendar.*;

public class SwitchStatment {

    private static void printDayOfWeek() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the day: ");
        String day = input.nextLine();

        switch (day) {
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wendsday":
                System.out.println("Today is Wendsday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                break;
            default:
                System.out.println("Is Weekend");
        }
    }






     private static void printDayOFWeekSimpleEdition () {
        Scanner input = new Scanner(System.in);
        System.out.println ( "insert 1 - 45 numarul zilei");
        int day = input.nextInt();

        switch (day) {
            case MONDAY -> System.out.println("MONDAY");
            case TUESDAY -> System.out.println("TUESDAY");
            case WEDNESDAY -> System.out.println("WENSDSAY");
            case THURSDAY -> System.out.println("THURSDAY");
            case FRIDAY -> System.out.println("FRIDAY");
        }
    }


    private static void printGrdade ( ) {
            Scanner input =new Scanner(System.in);
        System.out.println("inserati o nota de la a la d");
        String grade = input.nextLine().toUpperCase();
        int i = 0;



        switch (grade){
            case "A" -> System.out.println("bravo");
            case "B" -> System.out.println("almost");
            case "C" -> System.out.println("not good ");
            case "D" -> System.out.println("");
        }
    }






}
