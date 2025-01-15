package projects.Quiz;
import java.util.Scanner;

public class quiz_terminal {

    public static void main(String[] args) {
        int punkte = 0;

        //#region Frage1
        int a = 15;
        int b = 255;
        int c = 16; // true
        int d = 5;
        
        System.out.println("Wie viele Bundesländer hat Deutschland ?");
        System.out.println("a) " + a + "   b) " + b + "   c) " + c + "   d) " + d);

        Scanner checker = new Scanner (System.in);
//#regionregion     ab hier mit hilfe von ChatGPT
        int eingabe = -1;

        while (true) {
            System.out.print("Gib deine Antwort (a, b, c, d) ein: ");
            String input = checker.nextLine().toLowerCase();

            if (input.equals("a")) {
                eingabe = a;
                break;
            } else if (input.equals("b")) {
                eingabe = b;
                break;
            } else if (input.equals("c")) {
                eingabe = c;
                break;
            } else if (input.equals("d")) {
                eingabe = d;
                break;
            } else {
                System.out.println("Ungültige Eingabe. Bitte gib a, b, c oder d ein.");
            }
        }

//#endregion        bist hier mit ChatGPT

        if (eingabe == c) {
            System.out.println("Richtig! Plus 1 Punkt");
            punkte += 1;
        } else {
            System.out.println("Falsch, Antwort " + c + " war richtig");
        }


        checker.close();
        //#endregion

    }
}