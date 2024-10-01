import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Bitte geben Sie eine positive Ganzzahl ein: ");
        int zahl = scanner.nextInt();

        int quersumme = berechneQuersumme(zahl);


        //Ausgabe Quersumme
        System.out.println("Die Quersumme ist " +quersumme);
    }

    private static int berechneQuersumme(int zahl) {
        int sum = 0;

        //Berechnung der Quersumme
        while (zahl > 0){
            sum = sum + zahl % 10;//letze zahl zu quersumme machen
            zahl = zahl / 10;//zahl um 10 verkleinern
        }
        return sum;
    }
}