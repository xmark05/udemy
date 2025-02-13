package OOP.OOP_4;

import java.util.Scanner;

public class GoogleKonto {

    private String BenutzerName;
    private String passwort;


    public GoogleKonto(String benutzeName, String passwort){
        this.BenutzerName = BenutzerName;
        this.passwort = passwort;
    }




    public String getPasswort(){
            return passwort;
    }

    public void setPasswort(String passwort){

        if (passwort.equals(this.passwort)) {
            System.out.println("Passwort stimmt kann geändert werden");
            System.out.println("Bitte neues Passwort eingeben: " );
            Scanner scan = new Scanner(System.in);
            String newPw = scan.nextLine();
            this.passwort = newPw;
            System.out.println("Passwort wurde erfolgreich geändert ");
        } else {
            System.out.println("Passwort falsch kann nicht geändert werden ");
        }
    }

    public String getBenutzeName(){
            return BenutzerName;
    }

    public void setBenutzeName(String BenutzerName){
        this.BenutzerName = BenutzerName;
    }


}