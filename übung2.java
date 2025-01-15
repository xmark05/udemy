public class übung2 {
    public static void main(String[] args) {
        /*
         * Aufgabe: 
         * 
         * 1. Auto kostet 3500
         * 2. Auto kostet 2340,48
         * 
         * 1. Daten in Variablen abspeichern
         * 2. Kommazahl umwandeln zu einer Ganzzahl
         * 3. Beide Ganzzahlen zu einer Gesamtbetrag verrechnen
         * 4. Gesamtbetrag ausgeben 
         */

         int Auto1 = 3500;
         int Auto2 = (int)2340.48;

         int Gesamtbetrag = Auto1 + Auto2; 

         System.out.println("Der gesamt Preis für beide Autos ist: "+  Gesamtbetrag + "€.");
    }
}