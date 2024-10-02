import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Zahlen entgegennehmen
        System.out.print("Bitte gib eine ganze Zahl ein: ");
        int zahl1 = scanner.nextInt();
        System.out.print("Bitte gib eine zweite ganze Zahl ein: ");
        int zahl2 = scanner.nextInt();

        if (zahl1 > zahl2) {
            System.out.println(" Error ");
        }
        else {
            System.out.println("Zahl, Quersumme, Zahl/Quersumme");

            for (int i = zahl1; i <= zahl2; i++) {
                int sum = berechneQuersumme(i);

                // sum -> Quersumme von i
                if (i % sum == 0) {
                    System.out.println(i + ", " + sum + ", " + i / sum);
                }

            }
        }
    }

    private static int berechneQuersumme ( int zahl){
        int sum = 0;

        //Berechnung der Quersumme
        while (zahl > 0) {
            sum = sum + zahl % 10;//letze zahl zu quersumme machen
            zahl = zahl / 10;//zahl um 10 verkleinern
        }

        return sum;
    }
}

