package projects.OOP_Übung2_Assoziation;

public class Auto {

    String autoMarke;
    Reifen reifen;


    public Auto(String autoMarke, String reifenMarke, String reifenTyp) {
        this.autoMarke = autoMarke;
        reifen = new Reifen(reifenMarke, reifenTyp);
    }

    public void ausgabeDaten(){
        System.out.println("Die Automarke ist: " + this.autoMarke + " und der ReifenTyp ist: " + this.reifen.reifenMarke);
    }

}