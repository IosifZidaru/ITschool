package homeworks;

import javax.management.StringValueExp;

public class season6 {
    public static void main(String[] args) {

        // REVERSE A STRING

        String text1 = "Salut";
        StringBuilder sb1 = new StringBuilder(text1);
        String reversed = sb1.reverse().toString();
        System.out.println("1. reverse ; " + reversed);

        // 2. PALINDROME CKECKER

        String text2 = "Lume";
        StringBuilder sb2 = new StringBuilder(text2);
        String reversed2 = sb2.reverse().toString();
        if (text2.equalsIgnoreCase(reversed2)) {
            System.out.println("2. Este palindrom");
        } else {
            System.out.println("2. NU este palindrom");
        }

        // Concantace multiple strings

        String[] words = {"Salut", " ", "Lume", "!"};
        StringBuilder sb3 = new StringBuilder();

        for (String w : words) {
            sb3.append(w);
        }
        System.out.println("3. Concatenat : " + sb3.toString());


        // 4 Removing Vowels

        String text4 = "Ceau imi place sa mananc! ";
        StringBuilder sb4 = new StringBuilder();
        for (char c : text4.toCharArray()) ;
        if (!"aeiouAEIOU".contains(String.valueOf(sb4))) {
            sb4.append(sb4);
        }
        System.out.println("4. Fara vocale; " + sb4.toString());


        // word capitalizer

        String sentance = "Salut baietiilor barosani";
        StringBuilder sb5 = new StringBuilder();
        boolean capitalizaNext = true;
        for (char c : sentance.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                capitalizaNext = true;
                sb5.append(c);
            } else {
                if (capitalizaNext) {
                    sb5.append(Character.toUpperCase(c));
                    capitalizaNext = false;
                } else {
                    sb5.append(c);
                }
            }
        }
        System.out.println("5. Capitalizat: " + sb5.toString());

    }


}




