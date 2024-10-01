import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
int km;

        System.out.println("Wieviele Kilometer möchtest du rennen? Gib eine Zahl von 1-42 ein.");

        Scanner scanner = new Scanner(System.in);
         km = scanner.nextInt();
        if(km>42){
            System.out.println("Das schaffst du nicht.");

        }

        else{
            int round= (km*1000/400);
            System.out.println("Du wirst " + round + " Runden rennen.");
        }

        System.out.println("Bist du bereit? Drücke 1 wenn ja, und 0 wenn nicht");
        scanner = new Scanner(System.in);
        int zahl1= scanner.nextInt();
        int ja = Integer.valueOf(zahl1);
        if(ja<=0){
            System.out.println("Okay dann nicht.");
        }
        else{
            int i= 1;
            int zahl2 =Integer.valueOf(i);
            System.out.println("Dann geht es los");

            System.out.println("Wie viele Kilometer bist du gelofen?");
            scanner = new Scanner(System.in);
            int zahl3= scanner.nextInt();
            int kmdone = Integer.valueOf(zahl3);

            if (kmdone<km){
                System.out.println("Mach weiter");
                System.out.println("Wie viele Kilometer bist du gelofen?");
                scanner = new Scanner(System.in);
                int zahl4= scanner.nextInt();
                int kmdon = Integer.valueOf(zahl3);
            }
            else{
                System.out.println("Du hast es geschafft");
            }
        }

    }


}
