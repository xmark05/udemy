package OOP.OOP_2;

public class Tier {

    String name;
    int groeße;
    int gewicht;

    public Tier(String name, int groeße, int gewicht){
        this.name = name;
        this.groeße = groeße;
        this.gewicht = gewicht;
    }

    public void essen(){
        System.out.println("Das Tier hat gegessen");
    }
}
