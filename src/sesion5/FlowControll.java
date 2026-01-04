package sesion5;

public class FlowControll {
    public static void main(String[] args) {
        printNumberWhileDo(5);
    }

    public static void printNumberWhileDo (int number){
        while (number<= 10){
            System.out.println("numarul: " + number);
            number++;
        }
    }


    public static void printNumbersDoWile(int number ){
        do{
            System.out.println("numarul: " + number);
            number++;
        } while (number <= 10);
    }



    public static void printNumbersFor (int number) {
        for (int i = 0; i <= number; i++){
            System.out.println("numarul; " +i);
        }
    }



    public static void printNumbersForEach(int[] array){
        for (int number: array){
            System.out.println("numarul; " + number);
        }
    }



    public static void printListOFList(int[][] biArray){
        for (int[] array : biArray){
            for (int number : array){
                System.out.print(number);
            }
            System.out.println();
        }
    }


    public static void  printUntilValue (int value){
        for (int i = 0; i<= 10; i++){
            if (i == value ){
                break;
            }
            if (i == 2){
                continue;
            }
            System.out.println("numaruk until Value" + i);
        }
    }


}
