package projects.OOP_Übung2_Assoziation;

public class Auto {

    String autoMarke;
    Reifen reifen;


    public Auto(String autoMarke, String reifenMarke, String reifenTyp) {
        this.autoMarke = autoMarke;
        reifen = new Reifen(reifenMarke, reifenTyp);
    }

}