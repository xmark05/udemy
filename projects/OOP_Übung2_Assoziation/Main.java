package projects.OOP_Übung2_Assoziation;

public class Main {

    public static void main(String[] args) {
        Auto auto = new Auto("BMW", "rMarke", "Winter");
        System.out.println("Das Auto, worüber wir sprechen heißt: " + auto.autoMarke + " und hat gerade " + auto.reifen.reifenTyp + " Reifen drauf.");
    }
}