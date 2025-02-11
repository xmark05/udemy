package OOP.OOP_2;

public class Main {

    public static void main(String[] args) {

        Hund bello = new Hund("Bello", 3, 80, 42);
        bello.essen();

        System.out.println("");

        Kuh olga = new Kuh("Olga", 5, 120, 4);
        olga.essen();

        System.out.println("");

        katze nika = new katze("Nika", 2, 15, false);
        System.out.println("Der Name der Katze ist: " + nika.name + ", Sie gehört zur groeßen Tabelle: " + nika.groeße);
        // nika.essen();


        System.out.println("---------------------------------------------------------------------------");


        BMW x1 = new BMW(100, 5, "Sport", true);

        Audi A3 = new Audi(200, 5, "Sport", false);
        A3.starten();

        System.out.println("----------------------------------------------------------------------------");

        Laptop dell = new Laptop("Dell", 8, "Intel", 400.99);

        MacBook Mac = new MacBook(16, "Intel", 999.99, true);
        dell.startenLap();
        Mac.startenLap();
    }
}