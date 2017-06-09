package treciaPaskaita;

import java.util.Arrays;

/**
 * Created by Lina on 2017.06.08.
 */
public class MainApp18 {
    public static void main(String[] args) {
        int[] masPirmas = {84 , 3, 5, 6, 1, 83 };
        System.out.println(Arrays.toString(masPirmas));
        System.out.println(Arrays.toString(reverseArray(masPirmas)));
    }

    private static int[] reverseArray (int mas[]){
        int[] reversed = new int[mas.length];
        for(int i = 0 ; i < mas.length; i++ ){
            reversed[mas.length - 1 -i] = mas[i];
        }
        return reversed;
    }
}
