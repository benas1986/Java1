package treciaPaskaita;

import java.io.*;


/**
 * Created by Lina on 2017.06.08.
 */
public class MainApp22 {
    public static void main(String[] args) {

        try {
            //File file = new File("vardai.txt");
            //FileReader fileReader = new FileReader(file);
            //BufferedReader bf = new BufferedReader(fileReader);

            BufferedReader bf = new BufferedReader(new FileReader(new File("vardai.txt")));
            String line = "";
            while((line = bf.readLine()) != null){
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Nepavyko nuskaityti failo");
        }
    }
}
