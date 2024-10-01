public class Main {
    public static void main(String[] args) {
        System.out.println("Kleines 1x1");
        // Äußere Schleife für die erste Zahl (1 bis 10)
        for (int i = 1;
             i <= 10; i++) {
            // Innere Schleife für die zweite Zahl (1 bis 10)
            for (int j = 1;
                 j <= 10; j++) {
                // Ausgabe des Produkts von i * j
                System.out.print((i * j) + "\t");
            }
            // Zeilenumbruch nach jeder Reihe (nach jeder Zeile von i)
            System.out.println();
        }
    }
}
