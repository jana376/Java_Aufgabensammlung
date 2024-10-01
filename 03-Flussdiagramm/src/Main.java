public class Main {
    public static void main(String[] args) {
        int i = 1;
        int ia = i+1;
        int zahl2 = Integer.valueOf(ia);

        if(i<=10){
            // Convert the input to an integer

            int zahl1 = Integer.valueOf(i);
            // Output the result
            System.out.println("Die Zahl " + zahl2 + " ist kleiner als 10.");

        }
    else {
            System.out.println("Die Zahl " + zahl2 + " ist grösser als 10.");
        }
    }
}
