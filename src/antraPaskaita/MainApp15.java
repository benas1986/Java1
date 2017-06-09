package antraPaskaita;

import utils.NumberUtils;


import java.util.Scanner;

/**
 * Created by Lina on 2017.06.07.
 */
public class MainApp15 {

    public static void main(String[] args) {
        System.out.println("Iveskite skaiciu n");
        Scanner sc = new Scanner(System.in);

        int n = NumberUtils.duotiTeigiamaSkaiciu(sc);

        System.out.println("Iveskite ką darysite su skaiciais: 1 - Suma, 2 - Sandauga");
        int operacija = 0;

        while (true) {
            System.out.println("Iveskite 1 arba 2 ");
            operacija = NumberUtils.getCorrectNumber(sc);
            if (operacija == 1 || operacija == 2) {
                break;
            }
        }
        // int operacija = NumberUtils.getCorrectNumber(sc);

        int suma = 1;

        for (int i = 2; i <= n; i++){
            if (operacija == 1) {
                suma += i ;
            }else {
                suma *= i;
            }
        }
        System.out.println("atsakymas: "+ suma);
        }

    }





