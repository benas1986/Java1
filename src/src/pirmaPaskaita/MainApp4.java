package pirmaPaskaita;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by Lina on 2017.06.06.
 */
public class MainApp4 {
    public static void main(String[] args) {
        int[] masyvas = new int[5];

        Scanner sc = new Scanner(System.in);
       // int number = sc.nextInt();
        int suma = 0;
        for (int i = 0; i<5; i++){
            System.out.println("Iveskite skaičių:");
            masyvas[i] = sc.nextInt();
            suma += masyvas[i];
        }
        System.out.println("Skaiciu suma: " + suma);
        for(int m : masyvas){
            System.out.println(m);
        }
    }
}
