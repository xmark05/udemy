package OOP.OOP_2;

public class Audi extends Auto {

    boolean quattro; 

    public Audi(int ps, int türen, String fahrzeugTyp, boolean quattro) {
        super("Audi", ps, türen, fahrzeugTyp);
        this.quattro = quattro;
    }

    @Override
    public void starten(){
        super.starten();
        System.out.println("Der Audi startet");
    }

    
}