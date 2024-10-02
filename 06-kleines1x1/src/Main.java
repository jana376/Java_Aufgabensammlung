public class Main {
    public static void main(String[] args) {
        System.out.println("Kleines 1x1");
        // Äussere Schleife für die erste Zahl (1 bis 10)
        for (int a  = 1;
             a <= 10; a++) {
            // Innere Schleife für die zweite Zahl (1 bis 10)
            for (int b = 1;
                 b <= 10; b++) {
                // Ausgabe des Produkts von i * j
                System.out.print((a * b) + "\t");
            }
            // Zeilenumbruch nach jeder Reihe (nach jeder Zeile von i)
            System.out.println();
        }
    }
}
