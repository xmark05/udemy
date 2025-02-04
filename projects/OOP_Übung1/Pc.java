package projects.OOP_Übung1;

public class Pc {

    // Selfmade Aufgaben ;D 

    int Preis;
    String Marke;
    int Ram;
    String Cpu;
    String Grafikkarte;
    String Mainboard;


    public Pc(int Preis, String Marke, int Ram, String Cpu, String Grafikkarte, String Mainboard) {
        this.Preis = Preis;
        this.Marke = Marke;
        this.Ram = Ram;
        this.Cpu = Cpu;
        this.Grafikkarte = Grafikkarte; 
        this.Mainboard = Mainboard;
    }

    public void getPcData(){
        System.out.println("Preis: " + Preis + " Marke: " + Marke + " Ram: " + Ram + " Cpu: " + Cpu + " Grafikkarte: " + Grafikkarte +
         " Mainboard: " + Mainboard );
    }
}