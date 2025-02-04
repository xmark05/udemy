package OOP.OOP_2;
public class katze extends Tier{
    boolean trinken;


    public katze(String name, int groeße, int gewicht, boolean trinken){
        super(name, groeße, gewicht);
        this.trinken = trinken;
        
    }

    @Override
    public void essen(){
        System.out.println("Die Katze isst");
        super.essen();
    }
}