public class methoden {

    public static void main(String[] args) {
        ausgabe();
        summe();
    }

    static void ausgabe() {
        System.out.println("Ich bin eine Methode");
    }

    static void summe() {
        int a,b,summe;
        a = 5;
        b = 5;

        summe = a + b;
        System.out.println(summe);
    }
}