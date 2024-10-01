public class Main {
    public static void main(String[] args) {
                // Zähler für die Anzahl der ausgegebenen Zahlen
                boolean ersteZahl = true;

                // Schleife von 1 bis 30
                for (int i = 1; i <= 30; i++) {
                    // Prüfen, ob die Zahl durch 3 oder 5 teilbar ist
                    if (i % 3 == 0 || i % 5 == 0) {

                        //vor jeder Zahl ausser der ersten kommt ein Komma
                        if (!ersteZahl) {
                            // Komma vor der Zahl, außer es ist die erste Zahl
                            System.out.print(", ");
                        }
                        // Zahl ausgeben
                        System.out.print(i);
                        ersteZahl = false; // Nach der ersten Zahl das Komma zulassen
                    }
                }

            }
        }

