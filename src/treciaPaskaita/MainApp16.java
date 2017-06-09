package treciaPaskaita;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Lina on 2017.06.08.
 */
public class MainApp16 {

    public static void main(String[] args) {
        int[] mas = {5, 10, 15, 16, 115};
        System.out.println("Didziausia reiksme: " + masyvoDidziausiaReiksme(mas));
        System.out.println("Kita didziausiausia reiksme: " + getMaxNumber(mas));
        System.out.println("Maziausia reiksme: " + getMinNumber(mas));
    }

    private static int masyvoDidziausiaReiksme(int[] mas) {
            int didziausiaReiksme = 0;
            for (int i = 1; i < mas.length; i++) {
                if (mas[i] > didziausiaReiksme) {
                    didziausiaReiksme = mas[i];
                }
            }
            return didziausiaReiksme;
        }

    private static int getMaxNumber(int[] mas){
        Arrays.sort(mas);
        return mas[mas.length - 1] ;
        }

    private static int getMinNumber(int[] mas){
        Arrays.sort(mas);
        return mas[0] ;
    }
}


