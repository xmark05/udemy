package OOP.OOP_5;

public class Hund extends Tier {
    
    int zaehne;

    public Hund(String name, int größe, int gewicht, int zaehne) {
        super(name, größe, gewicht);
        this.zaehne = zaehne;
    }

    public void bellen(){

    }


    @Override
    public void essen(){
        System.out.println("Der Hund muss sein Essen noch kauen");
    }

    @Override
    public void atmen() {
        throw new UnsupportedOperationException("Der Hund atmet über die Lunge");
    }

}