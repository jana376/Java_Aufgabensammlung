import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Bitte geben Sie eine positive Ganzzahl ein: ");
        int zahl = scanner.nextInt();

        int quersumme = 0;

        //Berechnung der Quersumme
      while (zahl>0){
          quersumme += zahl%10;//letze zahl zu quersumme machen
          zahl /=10;//zahl um 10 verkleinern
      }
      //Ausgabe Quersumme
        System.out.println("Die Quersumme ist " +quersumme);
    }
}