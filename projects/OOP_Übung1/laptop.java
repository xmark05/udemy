package projects.OOP_Übung1;

// Übung 1
/*
 * Aufgabe: 
 * 
 * Erstelle eine Klasse mit dem Namen laptop
 * Diese Klasse soll folgende Eigenschaften haben: 
 * 
 * ram; 
 * preis;
 * marke; 
 * 
 * Definiere einen Konstriktor der diese 3 Eigenschaften beim Erstellen eines Objektes, dieses 
 * Objekt direkt mit Werte befüllt.
 * 
 * Definiere eine Methode die diese 3 Eigenschaften beim Aufrufen der Methode in der Konsole ausgibt.
 * 
 */
public class laptop {
    int ram;
    double preis;
    String marke;

    public laptop(int ram, double preis, String marke){
        this.ram = ram;
        this.preis = preis;
        this.marke = marke;
    }

    public void getData(){
        System.out.println("Ram: " + this.ram + " Preis: " + this.preis + " Marke: " + this.marke);
    }
}