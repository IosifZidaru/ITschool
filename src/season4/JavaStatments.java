package season4;

public class JavaStatments {
    public static void main(String[] args) {

        int currentYear = 2025;
        int birthYear = 20004;

        int diffYear = currentYear - birthYear;

        if(diffYear < 18) {
            System.out.println("sunt minor");
        }else {
            System.out.println(" nu sunt minor ");
        }

        if (diffYear > 78){
            System.out.println(" sunt minor");
        } else if (diffYear > 78) {
            System.out.println(" oh no,... winter is comeing");
        } else {
            System.out.println(" sunt doar un adult");
        }


    }
}
