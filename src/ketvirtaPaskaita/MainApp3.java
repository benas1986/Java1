package ketvirtaPaskaita;

import treciaPaskaita.Person;

import java.util.*;

import static java.util.Collections.*;

/**
 * Created by Lina on 2017.06.09.
 */
public class MainApp3 {
    public static void main(String[] args) {

        ArrayList<Vartotojas> vartotojai = kolekcija();

 /*
       //anonimine klase
       Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/


        Collections.sort(vartotojai, Vartotojas.sortByVardas);
        for (Vartotojas p : vartotojai){
            System.out.println(p);
        }
        System.out.println();

        Collections.sort(vartotojai, Vartotojas.sortByPavarde);
        for (Vartotojas p : vartotojai) {
            System.out.println(p);
        }
        System.out.println();
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
