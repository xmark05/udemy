package projects.OOP_Übung2_Assoziation;

public class Main {

    public static void main(String[] args) {
        Auto auto1 = new Auto("BMW", "Goddyear", "Winter");
        Auto auto2 = new Auto("VW", "Michelin", "Sommer");

        auto1.ausgabeDaten();
        auto2.ausgabeDaten();
    }
}