package treciaPaskaita;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Lina on 2017.06.08.
 */
public class MainApp23 {
    public static void main(String[] args) {

        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File("vardai.txt")));
            String line = "";
            while ((line = bf.readLine()) != null) {
                if (line.startsWith("A")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Nepavyko nuskaityti failo");
        }
    }
}
