import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dieses Programm berechnet die Summe von zwei Zahlen.");
        System.out.print("Zahl 1: ");

        //Eingabe von Zahlen
        String eingabe = scanner.nextLine(); //wie ReadLine() in C#
        int zahl1 = Integer.valueOf(eingabe);


        System.out.print("Zahl 2: ");
        String eingabe2 = scanner.nextLine();
        int zahl2 = Integer.valueOf(eingabe);


        //Verarbeitung der Rechnung
        int sum= zahl1+zahl2;
        System.out.print(zahl1+zahl2);



    }
}