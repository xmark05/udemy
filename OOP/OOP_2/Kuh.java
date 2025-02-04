package OOP.OOP_2;

public class Kuh extends Tier{
    int hufe;

    public Kuh(String name, int groeße, int gewicht, int hufe){
        super(name, groeße, gewicht);
        this.hufe = hufe;
    }

    @Override
    public void essen(){
        super.essen();
        System.out.println("Die Kuh muss dass essen immer wieder kauen");
    }
}