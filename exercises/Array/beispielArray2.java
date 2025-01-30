package exercises.Array;

import java.util.Scanner;

public class beispielArray2 {

    public static void main(String[] args) {
        
        String [] fragen = {"Wie viel ist 5+4?", "Wie viel ist 3*5?"};
        int [] antwort = {9, 15};

        int count = 0;

        while (count < fragen.length) {
            System.out.println(fragen[count]);

            Scanner scan = new Scanner(System.in);
            System.out.println("Gebe deine Antwort ein: ");
            int eingabeUser = scan.nextInt();

            if(eingabeUser == antwort[count]) {
                System.out.println("Richtig");
                count ++;
            } else {
                System.out.println("Falsch");
            }
        }
    }
}