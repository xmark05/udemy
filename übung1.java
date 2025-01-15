public class übung1 {

    public static void main(String[] args) {
         
        /*
         * Aufgabe:
         *
         * 1. Auto: 3500
         * 2. Alter: 18 
         * 3. Vorname: Peter
         * 4. Nachname: Müller
         * 
         * 1. Überlege Dir welchen Datentyp diese Information repräsentieren
         * 2. Lege Variablen fest und speicher diese Werte in den Variablen ab.
         * 3. Gebe die Werte mit Hilfe von System.out.println(""); aus 
         */

         int Auto = 3500;
         short Alter = 18;
         String Vorname = "Peter";
         String Nachname= "Müller";

         System.out.println("Herr " + Nachname + " das Auto kostet " + Auto + "€.");
         System.out.println(Vorname + " ist " + Alter + " jahre alt");


    }
}