package pirmaPaskaita;

import java.util.Scanner;

/**
 * Created by Lina on 2017.06.06.
 */

public class MainApp1 {

    public static final String NELYGINIS = "Nelyginis";
    public static final String JUK_SAKIAU_SKAICIU = "juk sakiau skaiciu!";
    public static final String IVESKITE_SKAICIU = "Iveskite skaiciu";
    public static final String LYGINIS = "Lyginis";

    public static void main(String[] args){
        System.out.println(IVESKITE_SKAICIU);
        Scanner sc = new Scanner(System.in);
        try {
            int val = sc.nextInt();

            isThisNumberEven(val);

        }catch(java.util.InputMismatchException e){

            System.out.println(JUK_SAKIAU_SKAICIU);
        }
    }
        private static void isThisNumberEven(int number){
            String message = NELYGINIS;

            if (number % 2 == 0){
           message = LYGINIS;
            }
            System.out.println(message);
            }
    }

