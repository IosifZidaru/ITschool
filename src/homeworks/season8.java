package homeworks;

import java.util.*;

public class season8 {
    public static void main(String[] args) {
        array1();
        ChristmashWishList();
        studentList();
        graduateStudentList();
        linkedList();
        arayListCotaining();
        liniarSeaech();
        binaryToDecimal();



    }

    // exercitiu 1 //

    public static void array1() {
        String[] shoppingList = {"Lapte", "Branza", "Cascaval", "Banane", "Mere"};

        for (String item : shoppingList) {
            System.out.println(item);
        }
    }

    // exercitiul 2 //

    public static void ChristmashWishList() {
        ArrayList<String> wishList = new ArrayList<>();

        wishList.add("Phone");
        wishList.add("Rtx5090");
        wishList.add("Bike");

        for (String iteam : wishList) {
            System.out.println(iteam);
        }

    }

    // exercitiu 3 //

    public static void studentList() {
        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduateStudentList = new ArrayList<>();

        // populate studiesList with 1 students //
        for (int i = 1; i <= 10; i++) {
            studentList.add("Student" + i);
        }

        //  copy value //
        graduateStudentList.addAll(studentList);

        //iterate and print graduates //
        for (String student : graduateStudentList) {
            System.out.println("Graduated: " + student);
        }
    }

    // exercitiu 4 //

    public static void graduateStudentList() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int evenCount = 0;
        int addCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                addCount++;
            }
        }
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Add numbers: " + addCount);
    }

    // exercitiu 5 //

    //static Scanner scanner = new Scanner(System.in);//

    // public static void CityList() { //
    //

    // exercitiul 6//

    public static void linkedList() {
        LinkedList<String> students = new LinkedList<>();
        students.add("Ale");
        students.add("Andra");
        students.add("Maaria");
        students.add("Marisa");
        String searchName = "Maaria";

        if (students.contains(searchName)) {
            students.remove(searchName);
            System.out.println(searchName + "was removed. ");
        } else {
            System.out.println(searchName + "not found.");
        }
        System.out.println(students);
    }


    // exercitiul 7 //

    public static void arayListCotaining() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Pear");

        Collections.sort(fruits, new Comparator<String>() {
            @Override
            public int compare(String f1, String f2) {
                if (f1.length() != f2.length()) {
                    return f2.length() - f1.length();
                }
                return f1.compareTo(f2);
            }
        });
        System.out.println(fruits);
    }

    //exercitiul 8 //

    public static void liniarSeaech() {

        String[] movies = {"Titanic", "Avatar", "Gladiator", "TeenWolf"};
        String searchMovie = "Avatar";
        boolean found = false;

        for (int i = 0; i < movies.length; i++) {
            if (movies[i].equals(searchMovie)) {
                System.out.println("movie found at position: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Movie not found");
        }
    }

    // exercitiu 9 //

    public static void binaryToDecimal() {

        String binaryNumber = "1011";

        int decimal = Integer.parseInt(binaryNumber, 2);

        System.out.println("Binary: " + binaryNumber);
        System.out.println("Decimal: " + decimal);
    }
}
