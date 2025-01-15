public class ifelse_verzweigung {

    public static void main(String[] args) {
        
        int mescore = 499;

        if (mescore >= 500) {
            System.out.println(" 3. Stern, Aktueller Score: " + mescore);
        } else if (mescore >= 250) {
            System.out.println("2. Sterne, Aktueller Score: " + mescore);
        } else if (mescore == 250) {
            System.out.println("1. Sterne, Aktueller Score: " + mescore);
        } else {
            System.out.println("Dein Scoure ist zu niedrig. Aktueller Score: " + mescore + " Benötigter Score: 250");
        }
    }
}