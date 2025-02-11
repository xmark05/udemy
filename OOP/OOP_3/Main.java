package OOP.OOP_3;

public class Main {

    public static void main(String[] args) {
        
/*
        Computer cp1 = new Computer(null, null, 0);

        Mainboard board1 = new Mainboard(1,1,1);
        System.out.println(board1);

        cp1.mainboard = board1;
        System.out.println(cp1.mainboard);

         Mainboard board2 = new Mainboard(1,1,1);
         Computer cp2 = new Computer("Intel", board2, 110);
         System.out.println(cp2.cpu + " und kostet " + cp2.preis + "€");

*/

         System.out.println("---------------------Beispiel 1------------------------------");

         Mainboard mainboardAsus = new Mainboard(4,2,4);
         Computer computerPeter = new Computer("Intel" , mainboardAsus ,400);
         System.out.println("Peter hat eine " + computerPeter.cpu + " Cpu und sein Mainboard hat " + mainboardAsus.ramSlots + " Ramslots. Sein Pc kostet: " + 
         computerPeter.preis + "€");

         System.out.println("");
         System.out.println("---------------------Beispiel 2------------------------------");

         Mainboard mainboardAsrock = new Mainboard(2,1,2);
         Computer computerOlga = new Computer("AMD", mainboardAsrock, 350);
         System.out.println("Olgas Pc hat eine " + computerOlga.cpu + " CPU und ihr Mainboard hat " + mainboardAsrock.ramSlots + " Ramslots. Ihr Pc kostet: " + 
         computerOlga.preis + "€");




    }

}