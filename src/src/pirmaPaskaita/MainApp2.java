package pirmaPaskaita;

import java.util.Scanner;

/**
 * Created by Lina on 2017.06.06.
 */
public class MainApp2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = null;

    do {
       System.out.println("Iveskite zodi");
       word = sc.nextLine();
    }while(!word.equals("pabaiga"));

    }
}
