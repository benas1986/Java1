package ketvirtaPaskaita;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * Created by Lina on 2017.06.12.
 */
public class MyApp6 {
    public static void main(String[] args) {
        ArrayList<Vartotojas> vartotojai = kolekcija();
        Iterator<Vartotojas> iteratorius = vartotojai.iterator();

        for (Vartotojas p : vartotojai){
            System.out.println(p);
        }

        System.out.println();

        while(iteratorius.hasNext()){
            Vartotojas o = iteratorius.next();
            iteratorius.next();
            iteratorius.remove();//ištrina kas antrą reikšmę
            }

            for (Vartotojas p : vartotojai){
                System.out.println(p);
            }
        }


    private static ArrayList<Vartotojas> kolekcija(){

        ArrayList<Vartotojas> vartotojai = new ArrayList<>();
        vartotojai.add(new Vartotojas("Benas", "Rimsa", 31, "Kaunas"));
        vartotojai.add(new Vartotojas("Lukas", "Lekavicius", 26, "Kaunas"));
        vartotojai.add(new Vartotojas("Zygimantas", "Janavicius", 27, "Kupiskis"));
        vartotojai.add(new Vartotojas("Robertas", "Javtokas", 38, "Vilnius"));
        vartotojai.add(new Vartotojas("Arvydas", "Sabonis", 56, "Utena"));
        vartotojai.add(new Vartotojas("Jonas", "Rimsa", 45, "Vilnius"));
        vartotojai.add(new Vartotojas("Vytautas", "Lekavicius", 26, "Radviliškis"));
        vartotojai.add(new Vartotojas("Paulius", "Motiejūnas", 27, "Kupiskis"));
        vartotojai.add(new Vartotojas("Stasys", "Maciulevičius", 38, "Jurbarkas"));
        vartotojai.add(new Vartotojas("Steponas", "Narvydas", 28, "Tauragė"));

        return vartotojai;

    }
}
