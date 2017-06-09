package treciaPaskaita;

import java.util.Scanner;

/**
 * Created by Lina on 2017.06.08.
 */
public class MainApp20 {
    public static void main(String[] args) {
        System.out.println("Iveskite zodi ar sakini: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String ab = "ab";
        //char letter = sc.nextLine().charAt(0);
        System.out.println("Iveskite dvi raides pagal kurias skaiciuosime");
        String letters = sc.nextLine();

        countLetter(word, letters);

    }

    private static void countLetter(String word, String ab){
        char a = ab.charAt(0);
        char b = ab.charAt(1);
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == a && word.charAt(i + 1) == b){
                count++;
            }

        }
        System.out.println(" radom " + count  + a + b + " raidziu");
    }
}




