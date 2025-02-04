package OOP.OOP_2;

public class Main {

    public static void main(String[] args) {

        Hund bello = new Hund("Bello", 3, 80, 42);
        bello.essen();

        System.out.println("");

        Kuh olga = new Kuh("Olga", 5, 120, 4);
        olga.essen();
    }
}