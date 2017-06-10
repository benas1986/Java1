package src.pirmaPaskaita;

import java.util.Scanner;

/**
 * Created by Lina on 2017.06.06.
 */

public class MainApp3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int number = 0;
        int suma = 0;
        int number = 0;

        do {
            System.out.println("Iveskite skaiciu");
            try {
                number = getGoodNumber(sc);
                suma += number;
            } catch (java.util.InputMismatchException e) {
                System.out.println("JUK SAKIAU SKAICIU");
                break;
            }
        } while (number != 0);

        System.out.println("Suma: " + suma);
    }
    private static int getGoodNumber(Scanner sc) {
        int number = 0;
        while (true) {
            try {
                number = sc.nextInt();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("JUK SAKIAU SKAICIU");
                sc.nextLine();
            }
        }
        return number;
    }
}





