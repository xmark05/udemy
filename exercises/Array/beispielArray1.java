package exercises.Array;

import java.util.Scanner;

public class beispielArray1 {

    public static void main(String[] args) {
        

        int [] lottoZahl = new int[6];

        for ( int i = 0; i < lottoZahl.length; i++){
            Scanner scan = new Scanner(System.in);
            int zahlUser = scan.nextInt();

            lottoZahl[i] = zahlUser;
        }

        for(int i = 0; i < lottoZahl.length; i++){
            System.out.println(lottoZahl[i]);
        }
    }
}