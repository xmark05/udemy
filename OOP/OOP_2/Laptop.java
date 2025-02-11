package OOP.OOP_2;

public class Laptop {
    String marke;
    int ram;
    String cpu;
    double preis;

    public Laptop(String marke, int ram, String cpu, double preis){
        this.marke = marke;
        this.ram = ram;
        this.cpu = cpu;
        this.preis = preis;
    }

    public void startenLap(){
        System.out.println(marke + " Laptop startet");
    }

    
}