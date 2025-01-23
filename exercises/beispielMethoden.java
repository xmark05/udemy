public class beispielMethoden {

    public static void main(String[] args) {
        
        int gegnerLeben = 100;
        System.out.println("BOSS HP: " + gegnerLeben);

        gegnerLeben = gegnerHit(gegnerLeben);
        System.out.println("HIT: " + gegnerLeben + " HP");

    }

    public static int gegnerHit(int aktuellLeben) {

        int neuGegnerLeben;
        

        neuGegnerLeben = aktuellLeben - 20;

        return neuGegnerLeben;
    }
}