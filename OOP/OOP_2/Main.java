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
        System.out.println("Der Name der Katze ist: " + nika.name + ", sie gehört zur groeßen Tabelle: " + nika.groeße);
        nika.essen();
    }
}