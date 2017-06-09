package antraPaskaita;

import utils.NumberUtils;
import java.util.Scanner;
/**
 * Created by Lina on 2017.06.07.
 */
public class MainApp14 {

    public static void main(String[] args) {
        System.out.println("Iveskite skaiciu n");
        Scanner sc = new Scanner(System.in);

        int n = NumberUtils.duotiTeigiamaSkaiciu(sc);

        int suma = 0;

        for (int i = 0; i <= n; i++){
            suma += i ;
        }

        System.out.println("atsakymas: " + suma);
    }


}
