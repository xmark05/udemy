package OOP.OOP_2;

public class BMW extends Auto{

    boolean xDrive;

    public BMW(int ps, int türen, String fahrzeugTyp, boolean xDrive) {
        super("BMW", ps, türen, fahrzeugTyp);
        this.xDrive = xDrive;
    }

    @Override
    public void starten() {
        super.starten();
        System.out.println("Der BMW startet");
    }

    
}