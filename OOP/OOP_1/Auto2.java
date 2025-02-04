package OOP.OOP_1;

public class Auto2 {
    String farbe;
    double Preis;

    public Auto2(){
        
    }

    public Auto2 (String farbe, double Preis) {
        this.farbe = farbe;
        this.Preis = Preis;
    }

    public void vergleichePreis(int Preis){
        if(this.Preis < Preis){
            System.out.println("Das " + this.farbe + " ist billiger");
        } else {
            System.out.println("Das " + this.farbe + " ist teurer");
        }
    }
}