package OOP.OOP_5;

public abstract class Tier {

    String name;
    int größe;
    int gewicht;

    public Tier() {
        
    }
    public Tier(String name, int größe, int gewicht){
        this.name = name;
        this.größe = größe;
        this.gewicht = gewicht;
    }

    public abstract void essen();

    public abstract void atmen();

    public String getName(){
        return name;
    }
}