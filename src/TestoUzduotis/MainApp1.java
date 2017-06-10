package TestoUzduotis;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Lina on 2017.06.09.
 */
public class MainApp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Įvesti pirmą skaičių: ");
        int pirmasSkaicius = gautiTeisingaSkaiciu(sc);

        System.out.println("Įvesti antrą skaičių: ");
        int antrasSkaicius = gautiSkaiciuNelyguNuliui(sc);

        System.out.println("Dviejų skaičių dalyba yra lygi -> " + dalyba(pirmasSkaicius, antrasSkaicius));
    }

    private static double dalyba(int a, int b) {
        double c;
        return c = (double) a / b;
    }

    public static int gautiSkaiciuNelyguNuliui(Scanner sc) {

        int skaicius = 0;

        while (true) {
            skaicius = gautiTeisingaSkaiciu(sc);
            if (skaicius != 0) {
                break;
            } else {
                System.out.println("Įveskite skaičių nelygų nuliui: ");
            }
        }
        return skaicius;
    }

    public static int gautiTeisingaSkaiciu(Scanner sc) {
        int skaicius = 0;
        while (true) {
            try {
                skaicius = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Blogai įvestas skaičius, pakartokite: ");
                sc.nextLine();
            }
        }
        return skaicius;
    }
}
