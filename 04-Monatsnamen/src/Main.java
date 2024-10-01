import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Gib eine Zahl ein von 1-12");

                // Array mit den Monatsnamen, man zähl erstmal alle EINZELN auf
                String[] monate = {
                        "Januar", "Februar", "März", "April", "Mai", "Juni",
                        "Juli", "August", "September", "Oktober", "November", "Dezember"
                };

                // Benutzer zur Eingabe auffordern

        Scanner scanner = new Scanner(System.in);
                System.out.println("Geben Sie eine Zahl zwischen 1 und 12 ein, um den Monat zu erhalten:");
                int monatNummer = scanner.nextInt();

                // Überprüfen, ob die Eingabe gültig ist
                if (monatNummer >= 1 && monatNummer <= 12) {
                    // Da Arrays bei 0 beginnen, muss die Eingabe um 1 verringert werden
                    System.out.println("Der Monat ist: " + monate[monatNummer - 1]);
                } else {
                    System.out.println("Ungültige Eingabe! Bitte geben Sie eine Zahl zwischen 1 und 12 ein.");
                }
            }

}