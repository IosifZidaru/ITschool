package homeworks;

public class season {
    public static void main(String[] args) {

        int heightOne = 132;
        int heightTwo = 198;

        int maximumheight = (heightOne > heightTwo)? heightOne : heightTwo ;

        System.out.println(" cea mai mare inaltime este; " + maximumheight);


        System.out.println(" numerele de la 1 la 10:");
        for (int i = 1; i <=10; i++){
            System.out.println(i);
        }
        System.out.println("\nNumerele pare de la 1 la 10;");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
          }
    }
}
