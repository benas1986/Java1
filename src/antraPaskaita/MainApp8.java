package antraPaskaita;

import utils.NumberUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Lina on 2017.06.07.
 */
public class MainApp8 {

    public static void main(String[] args) {

        System.out.println("Iveskite masyvo ilgi");
        Scanner sc = new Scanner(System.in);

        int masLength = NumberUtils.getCorrectNumber(sc);

        int[] mas = new int[masLength];
        int index = 1;
        for(int i =0; i< mas.length; i++ ){
            System.out.println("Iveskite " + index++ + " skaiciu");
            mas[i] = NumberUtils.getCorrectNumber(sc);
        }
        printNumbers(mas);
    }


    private static void printNumbers(int mas[]){
        for(Integer numb : mas){
            if (numb > 100){
                System.out.println(numb);
            }
        }
    }





}
