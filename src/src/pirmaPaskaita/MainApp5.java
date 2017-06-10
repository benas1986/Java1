package src.pirmaPaskaita;

import java.util.Scanner;

/**
 * Created by Lina on 2017.06.06.
 */
public class MainApp5 {
    public static void main(String[] args) {
        String[] masyvas = new String[5];

        Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Iveskite žodį:");
            masyvas[i] = sc.nextLine();

        }
        //adsgda   System.out.println("Skaiciu suma: " + suma);
        for (String m : masyvas) {
            System.out.println(m);
        }
    }
}
