package antraPaskaita;

import utils.NumberUtils;

import java.util.Scanner;

/**
 * Created by Lina on 2017.06.07.
 */
public class MainApp12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite skaiciu X: ");

        int x = NumberUtils.getCorrectNumber(sc);



        if (x <= 0){

            System.out.println("Funkcijos reikšmė: " + funkcijaTeigiamaiReiksmei(x));

        }else {

            System.out.println("Funkcijos reikšmė: " + funkcijaNeteigiamaiReiksmei(x));
        }

    }

    private static int funkcijaTeigiamaiReiksmei(int skaicius ){
        int funkcija;
        funkcija = 21-7 * skaicius;
        return funkcija;
    }

    private static int funkcijaNeteigiamaiReiksmei(int skaicius ){
        int funkcija;
        funkcija = 2  * skaicius+8;
        return funkcija;
    }
}
