package OOP.OOP_1;

public class Hund {
    int alter;
    String name;
    String rasse;

    public Hund() {
    
    }

    public Hund(int alter, String name, String rasse){
        this.alter = alter;
        this.name = name;
        this.rasse = rasse;
    }

    void bellen() {
        System.out.println("woof, woof");
    }
    
    void gassigehen(){
        System.out.println(this.name + " möchte jetzt gassi gehen!");
    }

}