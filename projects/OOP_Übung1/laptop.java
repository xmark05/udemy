package projects.OOP_Übung1;

public class laptop {
    int ram;
    double preis;
    String marke;

    public laptop(int ram, double preis, String marke){
        this.ram = ram;
        this.preis = preis;
        this.marke = marke;
    }

    public void getData(){
        System.out.println("Ram: " + this.ram + "Preis: " + this.preis + " Marke: " + this.marke);
    }
}