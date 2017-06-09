package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Lina on 2017.06.07.
 */
public class NumberUtils {
    public static int getCorrectNumber (Scanner sc){
        int response = 0;
        while(true) {
            try {
                response = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Blogai ivestas skaicius, pakartokite");
                sc.nextLine();
            }
        }
        return response;
    }

    public static int duotiTeigiamaSkaiciu(Scanner sc){

        int skaicius = 0;

        while (true){
            skaicius = getCorrectNumber(sc);
            if(skaicius > 0) {
                break;
            }else{
                System.out.println("Iveskite teigiama skaiciu");
            }
        }
        return skaicius;
    }
}
