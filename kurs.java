import java.util.Scanner;

public class kurs {
    public static void main(String[] args) {
        Menue();
    }

    static void Menue() {
        Scanner scan = new Scanner(System.in);
        int eingabe = 0;
                do {
                    System.out.println(" Menü ");
                    System.out.println(" [1] Übung1");
                    System.out.println(" [2] Übung2");
                    System.out.println();
                    System.out.println("Gebe eine Zahl ein:");
                    eingabe = scan.nextInt();
                    
        
                    switch (eingabe) {
                        case 1:
                            Übung1();
                            break;
                        case 2: 
                            Übung2();
                            break;
                    
                        default:
                            break;
                    }
                    if (eingabe != 0) {
                        System.out.println("Drücke eine beliebige Taste, " + 
                        "um das Programmfortzusetzen oder 0 um zu beenden");
                        scan.nextLine();
                        scan.nextLine();
                        
                    }
                } while (eingabe != 0);
                System.out.println("Programm beendet. ");
    }

    static void Übung1() {
        /*
         * Aufgabe:
         * 
         * 1. Auto: 3500
         * 2. Alter: 18
         * 3. Vorname: Peter
         * 4. Nachname: Müller
         * 
         * 1. Lege Variablen fest und speichere diese Werte in dem Variablen ab
         * 2. Gebe diese Werte aus 
         */

         int auto = 3500;
         int alter = 18; 
         String Vorname = "Peter";
         String Nachname = "Müller";

         System.out.println("Herr " + Nachname + "das Auto kostet" + auto + "€.");
         System.out.println(Vorname + "ist " + alter + " jahre alt");
    }

    static void Übung2() {
        /*
         * Aufgabe: 
         * 1. Auto: 3500
         * 2. Auto: 2340.48
         * 
         * 1.Daten in Variablen speichern
         * 2. Kommazahl in eine Ganzezahl umwandeln
         * 3. Beide zahlen zu einem Gesamt betrag verrechen 
         * 4. Gesamtbetrag ausgeben
         */

         int auto1 = 3500;
         int auto2 = (int)2340.40;

         int Gesamtbetrag = auto1 + auto2;

         System.out.println("Der Gesamtbetrag beträgt: " + Gesamtbetrag + "€");
    }
    
}