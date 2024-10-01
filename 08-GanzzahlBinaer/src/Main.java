import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner-Objekt zur Eingabe vom Benutzer erstellen
        Scanner scanner = new Scanner(System.in);

                System.out.print("Bitte geben Sie eine positive Ganzzahl ein: ");
                int zahl = scanner.nextInt();

                // Überprüfen, ob die Zahl positiv ist
                if (zahl < 0) {
                    System.out.println("Bitte geben Sie eine positive Ganzzahl ein.");
                } else {
                    // Umwandlung in binäres Format
                    String binaer = Integer.toBinaryString(zahl);

                    // Ausgabe des binären Formats
                    System.out.println(zahl + " im binären Format: " + binaer);
                }

                // Scanner schließen
                scanner.close();
            }
        }
