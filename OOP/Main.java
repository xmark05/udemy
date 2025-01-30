package OOP;

public class Main {

    public static void main(String[] args) {

        Auto bmw = new Auto();
        System.out.println(bmw);
        bmw.preis = 5000;
        bmw.marke = "BMW";

        System.out.println("Preis: " + bmw.preis + " Marke: " + bmw.marke);
        
        Auto audi = new Auto(4, 5000, "Audi");
        System.out.println("Reifenanzahl:" + audi.reifen + " Preis:" + audi.preis + " Marke:" + audi.marke);

        Auto2 Opel = new Auto2("blau", 20.3);
        System.out.println("Das Auto ist " + Opel.farbe + " und kostet " + Opel.Preis + "k");
    }
}