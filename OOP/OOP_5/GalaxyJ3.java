package OOP.OOP_5;

public class GalaxyJ3 extends Samsung implements ITelefon {

    public GalaxyJ3(double preis, String produktTyp) {
        super(preis, produktTyp);
    }
    
    @Override
    public void powerOn() {
        System.out.println("Das GalaxyJ3 geht an der rechten Seite an ");
    }

    @Override
    public boolean esKlingelt() {
            return false;
    }

    @Override
    public boolean anrufen() {
            return false;
    }

    
}