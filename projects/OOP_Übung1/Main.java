package projects.OOP_Übung1;

public class Main {

    public static void main(String[] args) {

        // Übung 2
        /*
         * Aufgae: 
         * 
         * Erstelle aus der eben erstellten Klasse 2 Objekte: 
         * 
         * 1. samsungLaptop: ram: 8gb, preis:600, marke: Samsung
         * 2. medionLaptop: ram 4gb, preos: 400, marke: Medion
         * 
         * Und rufe die Methode getData() mit dem Objek samsungLaptop und medionLaptop auf.
         */

        laptop samsungLaptop = new laptop(8, 600, "Samsung");
        laptop medionLaptop = new laptop(4, 400, "Medion");


        samsungLaptop.getData();
        medionLaptop.getData();

        System.out.println("-----------------------------------------------------");

        Pc dubaro = new Pc(1000, "dubaro", 32, "Intel ","RTX 5080","B450");
        Pc selfmade = new Pc(900, "selfmade", 16, "AMD ","RTX 5080","B550");

        dubaro.getPcData();
        selfmade.getPcData();

    }
}