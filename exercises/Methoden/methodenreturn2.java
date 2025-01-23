public class methodenreturn2 {

    public static void main(String[] args) {
        

        int a = summe();
        System.out.println("Der Wert aus der Methode ist: " + a);

        int summe = a - 5;
        System.out.println("Der Wert in summe ist: " + summe);
    }

    public static int summe() {
        int a, b, summe; //local Variable
        a = 5;
        b = 5;
        summe = a + b;

        return summe;
    }
}