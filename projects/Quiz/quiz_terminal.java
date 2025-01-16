package projects.Quiz;
import java.util.Scanner;


public class quiz_terminal {

    public static void main(String[] args) {
        int punkte = 0; // Punktestand
        Scanner scanner = new Scanner(System.in);

        Frage1(scanner, punkte);
        Frage2(scanner, punkte);

        scanner.close();
    }

    static void Frage1(Scanner scanner, int punkte) {
        int a = 15;
        int b = 255;
        int c = 16; // Richtig
        int d = 5;

        System.out.println("Wie viele Bundesländer hat Deutschland?");
        System.out.println("a) " + a + "   b) " + b + "   c) " + c + "   d) " + d);

        int eingabe = -1;

        while (true) {
            System.out.print("Gib deine Antwort (a, b, c, d) ein: ");
            String input = scanner.nextLine().toLowerCase();

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

        if (eingabe == c) {
            System.out.println("Richtig! Plus 1 Punkt");
            punkte += 1;
        } else {
            System.out.println("Falsch, Antwort c) " + c + " war richtig.");
        }
    }

    static void Frage2(Scanner scanner, int punkte) {
        String a = "Vincent van Gogh";
        String b = "Pablo Picasso";
        String c = "Leonardo da Vinci"; // Richtig
        String d = "Claude Monet";

        System.out.println("Wer malte die Mona Lisa?");
        System.out.println("a) " + a + "   b) " + b + "   c) " + c + "   d) " + d);

        String eingabe = "";

        while (true) {
            System.out.print("Gib deine Antwort (a, b, c, d) ein: ");
            eingabe = scanner.nextLine().toLowerCase();

            if (eingabe.equals("a") || eingabe.equals("b") || eingabe.equals("c") || eingabe.equals("d")) {
                break;
            } else {
                System.out.println("Ungültige Eingabe. Bitte gib a, b, c oder d ein.");
            }
        }

        if (eingabe.equals("c")) {
            System.out.println("Richtig! Plus 1 Punkt");
            punkte += 1;
        } else {
            System.out.println("Falsch, Antwort c) " + c + " war richtig.");
        }

        System.out.println("Aktuelle Punktzahl: " + punkte);
    }

    /* ... usw. Mehr Fragen sind mir nicht eingefallen, und ich wollte mit dem Kurs weitermachen, 
    da ich denke, dass ich selbst den Rahmen gesprengt habe. Es hat trotzdem sehr viel Spaß gemacht, und ich freue mich jetzt 
    schon auf komplexere Themen! :)
    */
}
