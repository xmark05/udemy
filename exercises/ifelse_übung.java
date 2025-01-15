public class ifelse_übung {

    public static void main(String[] args) {
        
        int score = 3400;

        if (score == 5000) {
            System.out.println("Du hast den mind. Score erreicht!!!");
        } else {
            System.out.println("Dein Score hat leider nicht gereicht. Du hast: " + score + " von 5000 erreicht! ");
        }

        boolean gegnerhit = false;
        int punkte = 0;

        if (gegnerhit == true) {
            punkte += 1;
            System.out.println("Punkteanzahl: " + punkte);
        } else {
            System.out.println("Gegner nicht getroffen");
        }

        int leben = 0;

        if (leben == 0) {
            System.out.println("Spiel verloren!! ");
            
        }
    }
}