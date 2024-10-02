import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wie lange soll die Linie sein? ");
        int zahl = scanner.nextInt();
        int row;
        int col = -2;

        for (row = 1; row <= zahl; row++) {
            if (row == zahl) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }

        for (col = 2; col <= zahl; col++) {
            System.out.println();
            int i = 1;
            while (i <= zahl) {

                if (row - i == col) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
i++;
            }
        }
    }
}

       /* int zahl = scanner.nextInt();
        int row;
        int col;

        for (row = 1; row <= zahl; row++)
            for (col = 1; col <= zahl; col++) {

                if (row == col) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
            }
        }
    }
}
*/

