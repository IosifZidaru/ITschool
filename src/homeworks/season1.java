package homeworks;

public class season1 {
    public static void main(String[] args) {

        boolean hasUsername = true;
        boolean hasPassword = false;

        if (hasUsername && hasPassword) {
            System.out.println("Authentication succesful");
        } else if (!hasUsername || hasPassword) {
            System.out.println("Authentication failed");
        }
        if (hasUsername && !hasPassword) {
            System.out.println("Password is incorect");
        }


        int[] numbers = new int[5];

        // Initializare: fiecare element devine index + 1
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + i;
        }

        // Afisare inaite
        System.out.println("Before decrement; ");
        for (int num : numbers) {
            System.out.println(num + " ");
        }
        System.out.println();

        // Decrementarea fiecarui element
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]--;
        }

        //Afisare dupa decrement
        System.out.println("After decrement;");
        for (int num : numbers) {
            System.out.println(num + " ");
        }

        int age = 30;

        String category =
               (age < 12) ? "Child" :
               (age <= 17) ? "Teenager" :
               (age <= 64) ? "Adult" :
                "Senior";
        System.out.println("classification: " + category);



        int a = 12, b = 25, c = 7;

        int largest = (a > b)
                ? ( a > c ? a : c )
                : ( b > c ? b : c ) ;
        System.out.println("Laregest number is: " + largest);





    }
}
