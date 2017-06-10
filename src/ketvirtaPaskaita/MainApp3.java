package ketvirtaPaskaita;

import java.util.*;

/**
 * Created by Lina on 2017.06.09.
 */
public class MainApp3 {
    public static void main(String[] args) {

        ArrayList<Vartotojas> vartotojai = kolekcija();

        Collections.sort(vartotojai); // vartotojai
        for(Vartotojas vartotojas : vartotojai){
            System.out.println(vartotojas);
        }
    }

    private static ArrayList<Vartotojas> kolekcija(){

        ArrayList<Vartotojas> vartotojai = new ArrayList<>();
        vartotojai.add(new Vartotojas("Benas", "Rimsa", 31, "Kaunas"));
        vartotojai.add(new Vartotojas("Lukas", "Lekavicius", 26, "Kaunas"));
        vartotojai.add(new Vartotojas("Zygimantas", "Janavicius", 27, "Kupiskis"));
        vartotojai.add(new Vartotojas("Robertas", "Javtokas", 38, "Vilnius"));
        vartotojai.add(new Vartotojas("Arvydas", "Sabonis", 56, "Utena"));

       return vartotojai;

    }

}
