package ketvirtaPaskaita;

import java.util.*;

/**
 * Created by Lina on 2017.06.09.
 */
public class MyMainApp1 {

    public static void main(String[] args) {

        listExample();
        setExample();
        mapExample();

    }

    private static void mapExample(){
        Map<Integer, String> maps  = new HashMap<>();
        // key turi buti unikalus, del to nerodo Rima o rodo Rima2 nes perraso reiksme
        maps.put(1, "Lukas");
        maps.put(2, "Rima");
        maps.put(3, "Benas");
        maps.put(4, "Andrius");
        maps.put(5, "Andrius");
        maps.put(2, "Rima2");

        // sunkesnis isvedimo budas - isvedimas per visą mapą
        for(Map.Entry<Integer, String> map : maps.entrySet() ){
            System.out.println("key -> " + map.getKey() + " val -> " + map.getValue());
        }
        // lengvesnis isvedimo budas kuris veikia ne per visa mapą o tik per key'u
        for(Integer map : maps.keySet()){

            System.out.println("key -> " + map + " val -> " + maps.get(map));
        }
    }

    private static void listExample(){
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Petras");
        arrayList.add("Antanas");
        arrayList.add("Benas");
        arrayList.add("Rima");
        arrayList.add("Lukas");
        arrayList.add("Andrius");

        Collections.sort(arrayList); // surikiavo pagal alfabeta
        for(String name : arrayList){
            System.out.println(name);
        }
        System.out.println(arrayList.size());
    }

    private static void setExample(){
        System.out.println("SET EXAMPLE");
        Set<Integer> setExample = new TreeSet<>();
        setExample.add(3);
        setExample.add(34);
        setExample.add(2);
        setExample.add(22);
        setExample.add(34);

        for(Integer val : setExample){
            System.out.println(val);
        }

        System.out.println("SET WITH OWN PBJECT");

        Set<Cat> cats = new TreeSet<>();
        Cat cat = new Cat(null, 0, null);
        cats.add(new Cat("Pukis", 7, "Persas"));
        cats.add(new Cat("Benas", 6, "Egzotas"));
        cats.add(new Cat("Lukas", 2, "Rainas"));
        cats.add(new Cat("Andrius", 1, "Persas"));
        cats.add(new Cat("Rima", 2, "Persas"));
        cats.add(new Cat("Benas", 6, "Egzotas"));


        for(Cat cat2 : cats){
            System.out.println(cat2);
        }

    }
}
