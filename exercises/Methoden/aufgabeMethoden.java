public class aufgabeMethoden {

    /*
     * Aufgabe: 
     * 
     * 1. Wert: 3.547
     * 2. Wert: 6.354
     * 
     * Definiere (erstelle) eine Methode die als Aufgabe hat, diese zwei Werte zu multipizieren (mal nimmt) 
     * Diese Werte sollen dabei als Paramter an die Methode übergeben werden 
     * 
     * Der Wert der errechnet wird soll dabei zurück gegeben werden, sodass wir den Wert in der Konsole
     * ausgeben können.
     */
    public static void main(String[] args) {

        
        double a = rechnen(3.547,6.354, '*');
        System.out.println(a);
    }

    public static double rechnen(double zahl1, double zahl2, char operator) {
        double summe;

        if( operator == '*') {
            summe = zahl1 * zahl2; 
        } else {
            summe = zahl1 / zahl2;
        }

        return summe;
    }
}