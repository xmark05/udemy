import java.util.Scanner;

public class übung3_scanner {

    public static void main(String[] args) {

        /* Aufgabe:
         * 
         * Erstelle ein Objekt der Klasse Scanner
         * und lese 2 Werte mithilfe dieser Klasse ein
         * 
         * 1. ist eine Ganzzahl, die Zahl soll dein Alter sein
         * 2. ist eine Zeichenkette(String), dein Name
         * 
         * Am Ende soll dein Alter und dein Name im Terminal ausgegeben werden
         */

         Scanner scan = new Scanner(System.in);
         System.out.println("Gebe deinen Namen an: ");
         String name = scan.next();

         System.out.println("Gebe dein Alter an: ");
         int alter = scan.nextInt();

         System.out.println("Du heißt: " + name + " und bist " + alter + " jahre alt.");



    }
}