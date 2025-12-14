package season8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayseExamples {
    public static void main(String[] args) {
        arrayExample1();
        arrayExample2();
        arrayListExample1();
        comparatii();


    }

    public  static void  arrayExample1(){
        String[ ] friends = {"Marcel", "Marcela", "Delia", "Iosif",};
        System.out.println("print prieten: " + friends[2]);
        System.out.println("cati prieteni am? " + friends.length);
        friends[2] = "Andrei";
        System.out.println("friends pe pozitia 2:" + friends[2]);
        System.out.println("toti prietenii: " + Arrays.toString(friends));
    }

    public static void arrayExample2(){
        int[ ] numbers = {12, 3, 5, 1231, 2503};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 12));
        System.out.println(numbers[2]);
        int[ ] numbers2 = Arrays.copyOfRange(numbers, 2, 4);
        System.out.println(Arrays.toString(numbers2));
    }

    public static void arrayListExample1(){
        List<String> friends  = new ArrayList<>(Arrays.asList("Marcel", "Marcela", "Ronaldo"));
        ArrayList<String> friends2 = new ArrayList<>();
       // friends = List.of(" marcel", "Marcela", "Ronaldo");
        System.out.println(friends.get(2));
        System.out.println(friends.size());

        friends.add("Messi e un gunoi");
        System.out.println(friends.get(2));
        friends.add("Iosif");
        System.out.println(friends.get(4));
        friends.addFirst("Delia");
        System.out.println(friends);
        friends.set(2, "Ronaldo");
        System.out.println(friends);
        friends.clear();
        System.out.println(friends);
    }

    public static void linkedListExample() {
        List<String> linked = new LinkedList<>();
        linked.add("Marcel");
        linked.add("MArcela");
        linked.add("Marius");

        System.out.println(linked.get(2));
        linked.add(1, "maria");
        System.out.println(linked);
        linked.remove(0);
        System.out.println(linked);

    }

    public static void comparatii() {
        int size = 50000;

        List<String> arraylist = new ArrayList<>();
        List<String> linked = new LinkedList<>();

        // Populam ambele liste
        for (int i = 0; i <= size; i++) {
            String value = String.valueOf(i);
            arraylist.add(value);
            linked.add(value);
        }


        long start = System.currentTimeMillis();
        for (int i = 0; i <= size; i++) {
            arraylist.get(size / 2);
        }
        long stop = System.currentTimeMillis() - start;

        long startLinked = System.currentTimeMillis();
        for (int i = 0; i <= size; i++) {
            linked.get(size / 2);
        }
        long stopLinked = System.currentTimeMillis() - startLinked;

        System.out.println(stop);
        System.out.println(stopLinked);


        start = System.currentTimeMillis();
        for (int i = 0; i <= size; i++) {
            arraylist.add(0, "x");
        }
        stop = System.currentTimeMillis() - start;

        startLinked = System.currentTimeMillis();
        for (int i = 0; i <= size; i++) {
            linked.add(0, "x");
        }
        stopLinked = System.currentTimeMillis() - startLinked;

        System.out.println(stop);
        System.out.println(stopLinked);

    }
}





