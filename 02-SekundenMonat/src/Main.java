import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Wieviele Tage hat der Monat, für den Sie die Sekunden berechnen wollen?");

        // Use the scanner object (lowercase) to call nextLine() (uppercase L)
        String eingabe = scanner.nextLine();

        // Convert the input to an integer
        int zahl1 = Integer.valueOf(eingabe);

        // Calculate the total number of seconds
        int sectotal = zahl1 * 24 * 3600;

        // Output the result
        System.out.println("Die Anzahl der Sekunden in " + zahl1 + " Tagen beträgt: " + sectotal);
    }
}
