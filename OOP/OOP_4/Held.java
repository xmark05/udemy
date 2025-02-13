package OOP.OOP_4;

public class Held {

    public String name;
    private int lebenspunkte;

    public Held(int lebenspunkte){
        if (lebenspunkte <= 100 && lebenspunkte > 0){
            this.lebenspunkte = lebenspunkte;
        } else {
            this.lebenspunkte = 90;
        }
    }

    public void HPanzeigen(){
        System.out.println("Du hast: " + this.lebenspunkte + "HP");
    }

    public void setLebenspunkte(int schaden) {
        this.lebenspunkte = this.lebenspunkte - schaden;
        System.out.println("Du hast schaden bekommen: " + this.lebenspunkte + "HP");
    }
}