package OOP.OOP_2;

public class Hund extends Tier {
    int zaehne;

    // Konstruktoren
    public Hund(String name, int groeße, int gewicht, int zaehne){
        super(name,groeße,gewicht);
        this.zaehne = zaehne;
    }

    public void bellen(){

    }

    @Override
    public void essen(){
        System.out.println("Der Hund muss sein essen noch kauen");
        super.essen();
    }
}