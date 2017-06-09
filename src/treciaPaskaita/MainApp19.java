package treciaPaskaita;

import java.util.Scanner;

/**
 * Created by Lina on 2017.06.08.
 */
public class MainApp19 {
    public static void main(String[] args) {
        System.out.println("Iveskite zodi ar sakini: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println("Iveskite raide pagal kuria skaiciuosime");
        char letter = sc.nextLine().charAt(0);
        countLetter(word, letter);
    }

    private static void countLetter(String word, char letter){
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == letter){
                count++;
            }
        }
        System.out.println(" radom " + count + letter + " raidziu");
    }
}


