package antraPaskaita;

import utils.NumberUtils;

import java.util.Scanner;

/**
 * Created by Lina on 2017.06.07.
 */
public class MainApp13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int skaicius = 0;
        do{

        System.out.println("Iveskite pirma skaiciu: ");
        int pirmasSkaicius = NumberUtils.getCorrectNumber(sc);
        System.out.println("Iveskite antra skaiciu: ");
        int antrasSkaicius = NumberUtils.getCorrectNumber(sc);

        System.out.println("Iveskite Operacijos tarp jų skaičiu: 1 - Suma, 2 - Skirtumas, 3 - Sandauga");

        int operacija = NumberUtils.getCorrectNumber(sc);

        int atsakymas = 0;

        switch(operacija){
            case 1:
                atsakymas = pirmasSkaicius + antrasSkaicius;
                break;
            case 2:
                atsakymas = pirmasSkaicius - antrasSkaicius;
                break;
            case 3:
                atsakymas = pirmasSkaicius * antrasSkaicius;
                break;
        }
            System.out.println("Atsakymas: " + atsakymas);
        skaicius = pakartok(sc);
    }while (skaicius == 0);

    }

    private static int pakartok(Scanner sc){
        System.out.println("Iveskite 0 jeigu norite pakartoti");
        int skaicius = 0;
        skaicius = sc.nextInt();
        return skaicius;
    }
}
