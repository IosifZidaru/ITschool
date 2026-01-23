package session14H;

import session15.Box;

import java.util.LinkedList;
import java.util.*;
import java.util.concurrent.Callable;

public class ShoppingHistory {

    private Map<String, Integer> frecventa = new HashMap<>();

    public ShoppingHistory(List<List<String>> carts){
        for (List<String> cart : carts) {
            for (String productId : cart) {
               addPurchase(productId);
          }
       }
    }
    public void addPurchase(String productId){
        frecventa.put(productId, frecventa.getOrDefault(productId, 0) + 1);
    }

    public List<String> topKFrequente(int k) {
        if (k <= 0 || frecventa.isEmpty()) {
            return Collections.emptyList();
        }

        Map<Integer, List<String>> bucket = new HashMap<>();

        for (String product : frecventa.keySet()) {
            int f = frecventa.get(product);
            bucket.computeIfAbsent(f, key ->new ArrayList<>()).add(product);
        }

            List<String> rezultat = new ArrayList<>();

            List<Integer> frecventaSortate = new ArrayList<>(bucket.keySet());
            frecventaSortate.sort(Collections.reverseOrder());

            for (int f : frecventaSortate){
                rezultat.addAll(bucket.get(f));
                if (rezultat.size() >= k) {
                    break;
                }
            }

            return rezultat;
    }

    public static void main(String[] args) {
        List<List<String>> carts = new ArrayList<>();

        carts.add(Arrays.asList("Ceapa", "Oua", "Cartof", "Ceapa"));
        carts.add(Arrays.asList("Oua", "Cartof", "Mere"));
        carts.add(Arrays.asList("Ceapa", "Mere", "Mere"));

        ShoppingHistory history = new ShoppingHistory(carts);

        history.addPurchase("C");
        history.addPurchase("C");

        int k = 2;
        System.out.println("Cele mai frecvente produse: " + history.topKFrequente(k));
    }

}

class ArraylistExercices{
    public static void main(String[] args) {

     // ex 1

        ArrayList<String> culoori = new ArrayList<>();
        culoori.add("Rosu");
        culoori.add("Mov");
        culoori.add("Maro");
        culoori.add("Portocaliu");
        System.out.println(culoori);

     // ex 2

        for (String culoarea : culoori){
            System.out.println(culoarea);
        }

     // ex 3

        culoori.add(0, "Alb");
        System.out.println(culoori);

        // ex 4
        System.out.println(culoori.get(2));

        // ex 5

        culoori.add(1, "Negru");
        System.out.println(culoori);

        // ex 6

        culoori.remove(2);
        System.out.println(culoori);

        // ex 7

        System.out.println(culoori.contains("Roz"));

        // ex 8

        Collections.sort(culoori);
        System.out.println(culoori);

        // ex 9

        ArrayList<String> copie = new ArrayList<>();
        System.out.println(copie);

        // ex 10

        Collections.shuffle(culoori);
        System.out.println(culoori);

        //  ex 11

        Collections.reverse(culoori);
        System.out.println(culoori);

        // ex 12

        ArrayList<String> sublista = new ArrayList<>(culoori.subList(0, 2));
        System.out.println(sublista);

        // ex 13

        System.out.println(culoori.equals(copie));

        // ex 14

        Collections.swap(culoori, 0, 1);
        System.out.println(culoori);

        // ex 15

        culoori.addAll(copie);
        System.out.println(culoori);

        // ex 16

        ArrayList<String> clona = (ArrayList<String>) culoori.clone();
        System.out.println(clona);

        // ex 17

        clona.clear();
        System.out.println(clona);

        // ex 18

        System.out.println(clona.isEmpty());

        // ex 19

        culoori.trimToSize();

        // ex 20

        culoori.ensureCapacity(20);

    }
}

class LinkedListExercices{
    public static void main(String[] args) {


        //ex 1
        LinkedList<String> list = new LinkedList<>();
        list.add("Rosu");
        list.add("Albastru");
        list.add("Verde");
        System.out.println();



        //  ex 2

        for (String culoare : list) {
            System.out.println(culoare);
        }

        // ex 3


        Iterator<String> it = list.listIterator(1);
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // ex 4

        Iterator<String> desc = list.descendingIterator();
        while (desc.hasNext()) {
            System.out.println(desc.next());
        }

        // ex 5

        list.add(1,"Galben");
        System.out.println(list);

        // ex 6

        list.addFirst("Alb");
        list.addLast("negru");
        System.out.println();

        // ex 7

        list.offerFirst("Roz");
        System.out.println(list);

       // ex 8

        list.offerLast("Mov");
        System.out.println(list);

        // ex 9

        LinkedList<String> extra = new LinkedList<>();
        extra.add("Auriu");
        extra.add("Turcoaz");
        list.addAll(2, extra);
        System.out.println();

        // ex 10
        System.out.println(list.indexOf("Rosu"));
        System.out.println();

        // ex 11

        for (int i = 0; i > list.size(); i++) {
            System.out.println(i + " -> " + list.get(i));
        }

        // ex 12

        list.remove("Mov");
        System.out.println(list);

        // ec 13

        list.removeFirst();
        list.removeLast();
        System.out.println("lst");

        // ex 14

        list.clear();
        System.out.println(list);

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        // ex 15

        Collections.swap(list, 1, 3);
        System.out.println(list);


        // ex 16

        Collections.shuffle(list);
        System.out.println(list);

        // ex 17

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("A");
        list2.add("B");
        list.addAll(list2);
        System.out.println(list);

        // ex 18

        LinkedList<String> clona = (LinkedList<String>) list.clone();
        System.out.println(clona);

        // ex 19

        System.out.println(list.pollFirst());
        System.out.println(list);

        // ex 20

        System.out.println(list.peekFirst());










    }
}

class HashSetExerecices {
    public static void main(String[] args) {

     // ex 1
     HashSet<String> set = new HashSet<>();
     set.add("Visimiu");
     set.add("Albastru");
     set.add("Maro");

     // ex 2

     for (String s : set) {
         System.out.println(s);
     }

     // ex 3

        System.out.println(set.size());

     //ex 4

     set.clear();
        System.out.println(set);

     set.add("A");
     set.add("B");
     set.add("C");


     // ex 5

        System.out.println(set.isEmpty());

     // ex 6

       HashSet<String> clona = (HashSet<String>) set.clone();
        System.out.println(clona);


        // ex 7

        String[] arr = set.toArray(new String[0]);

        // ex 8

        TreeSet<String> tree = new TreeSet<>(set);
        System.out.println(tree);

        // ex 9

        ArrayList<String> list = new ArrayList<>(set);
        System.out.println(list);

        // ex 10

        System.out.println(set.equals(clona));

        // ex 11

        set.retainAll(clona);
        System.out.println(set);

        // ex 12

        set.clear();
        System.out.println(set);
    }
}

class TreeSetExercices{
    public static void main(String[] args) {


        // ex 1 si 2

     TreeSet<Integer> set = new TreeSet<>();

     set.add(1);
     set.add(3);
     set.add(5);
     set.add(7);
        System.out.println();

        // ex 3

        TreeSet<Integer> copie = new TreeSet<>();

        // ex 4

        System.out.println(set.descendingSet());

        // ex 5

        System.out.println(set.first());
        System.out.println(set.last());

        // ex 6

        TreeSet<Integer> clona = (TreeSet<Integer>) set.clone();

        // ex 7

        System.out.println(set.size());

        // ex 8

        System.out.println(set.equals(clona));

        // ex 9

        System.out.println(set.headSet(7));

        // ex 10

        System.out.println(set.ceiling(4));

        // ex 11

        System.out.println(set.floor(4));

        // ex 12

        System.out.println(set.higher(3));

        // 13

        System.out.println(set.lower(3));

        // ex 14

        System.out.println(set.pollFirst());

        // ex 15

        System.out.println(set.pollLast());

        // ex 16

        set.remove(3);
        System.out.println(set);
    }
}

class HashMapExercices {
    public static void main(String[] args) {

        // ex 1

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");

        // ex 2

        System.out.println(map.size());

        // ex 3

        HashMap<Integer, String> copie = new HashMap<>(map);
        // ex 4

        map.clear();
        map.put(1, "A");
        map.put(2, "B");

        // ex 5

        System.out.println(map.isEmpty());

        // ex 6

        HashMap<Integer, String> shallow = (HashMap<Integer, String>) map.clone();

        // ex 7

        System.out.println(map.containsKey("1"));

        // ex 8

        System.out.println(map.containsValue(3));

        // ex 9

        System.out.println(map.entrySet());

        // ex 10

        System.out.println(map.get(1));

        // ex 11

        System.out.println(map.keySet());

        // ex 12

        System.out.println(map.values());
    }
    }

class TreeMapExercices{
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        // ex 1 si 2

        TreeMap<Integer, String> copie = new TreeMap<>();

        // ex 3

        System.out.println(map.containsKey(2));

        // ex 4

        System.out.println(map.containsValue("A"));

        // ex 5

        System.out.println(map.keySet());

        // ex 6

        map.clear();

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        // ex 7

        System.out.println(map);

        // ex 8

        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());

       // ex 9

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());

        // ex 10

        System.out.println(map.descendingMap());

        // ex 11

        System.out.println(map.floorEntry(2));

        // ex 12

        System.out.println(map.floorKey(2));

        // ex 13

        System.out.println(map.headMap(3));

        // ex 14

        System.out.println(map.headMap(3, true));

        // ex 15

        System.out.println(map.higherKey(3));

        // ex 16

        System.out.println(map.lowerEntry(3));

        // ex 17

        System.out.println(map.floorKey(3));






























    }
}






