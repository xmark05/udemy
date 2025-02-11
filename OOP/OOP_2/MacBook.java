package OOP.OOP_2;

public class MacBook extends Laptop {

    boolean touchBar; 

    public MacBook(int ram, String cpu, double preis, boolean touchBar) {
        super("Appel", ram, cpu, preis);
        this.touchBar = touchBar;
    }

    @Override
    public void startenLap(){
        super.startenLap();
        System.out.println(marke + " wird gestartet");
    }

    
}