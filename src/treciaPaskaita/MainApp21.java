package treciaPaskaita;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Lina on 2017.06.08.
 */
public class MainApp21 {

        public static void main(String[] args) {

            String[] word = {"KOL EINU ŠUNIE LOK", "ARGI TEN NE TIGRA" , "SĖDĖK UŽU KĖDĖS"};
            checkPaindromes(word);
        }

        private static void checkIsPalindrome(String word){
            String word1 = word.replace(" ","");

            boolean isPalindrome = true;

            for(int i = 0 ; i < word1.length(); i++ ){

                if(word1.charAt(i) != word1.charAt(word1.length() -1 -i)){
                    isPalindrome=false;
                }
            }

            System.out.println(word + " Is polindrome " + isPalindrome);
        }

        private  static void checkPaindromes(String[] palindromes){
            for (String p : palindromes){
                checkIsPalindrome(p);
            }

        }
    }

