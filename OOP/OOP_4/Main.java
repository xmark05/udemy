package OOP.OOP_4;

public class Main {

    public static void main(String[] args) {
        

        Held player1 = new Held(45);
        player1.HPanzeigen();
        
        int schaden = 10;

        player1.setLebenspunkte(schaden);
    }
}