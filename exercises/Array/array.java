package exercises.Array;

public class array {

    public static void main(String[] args) {
        

        int [] Arrayzahl = new int[5];
        Arrayzahl[0] = 10;
        System.out.println(Arrayzahl[0]);

        String [] ArrayText = new String[5];
        ArrayText[2] = "Test";
        System.out.println(ArrayText[2]);

        double [] Arraydouble = {30.30 , 20.20, 40.40, 10.01};
        System.out.println("Zahl1:" + Arraydouble[0] + "Zahl2: " + Arraydouble[1]);
    }
}