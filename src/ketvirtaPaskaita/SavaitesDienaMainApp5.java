package ketvirtaPaskaita;

import java.util.Scanner;

/**
 * Created by Lina on 2017.06.10.
 */
public class SavaitesDienaMainApp5 {

        public static void main(String[] args) {
          Savaite.Week week = Savaite.Week.FRIDAY;
          int dayNumb = Savaite.Week.MONDAY.getDay();

            printWeekDays();
            int skaicius = Ivedimas();
            while(true){
                if (skaicius > 0 && skaicius < 8){
                    break;
                }else{
                    skaicius = Ivedimas();

                }
            }
           System.out.println(Savaite.Week.getWeekDay(skaicius));
        }

    private static void printWeekDays(){
        for(Savaite.Week day: Savaite.Week.getWeeks()){
            System.out.println("Day >>" + day.name() + " value >>" + day.getDay());
        }
    }

    private static int Ivedimas(){
        System.out.println("Įveskite savaitės dieną pagal skaičių nuo 1 iki 7");
        Scanner sc = new Scanner(System.in);
        int skaicius = sc.nextInt();

        return skaicius;
    }
}
