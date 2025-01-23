public class methoden2 {

    public static void main(String[] args) {

/*     for(int i = 1; i<=10; i++ ) {
            gegnerErstellen();
        }
*/
        erstelleGegner("Peter", 10);
        erstelleGegner("Olaf", 200);
    }

 /*    static void gegnerErstellen() { 

        String gegnerName = "Mark";
        int gegnerLeben = 3;
        System.out.println("Gegner wurde erstellt");
    }
*/

        static void erstelleGegner(String name, int lebenspunkte) {
            String gegnerName = name;
            int gegnerLeben = lebenspunkte;
            System.out.println("Gegner wurde erstellt: " + gegnerName + " ,LP: " + gegnerLeben);

        }


}