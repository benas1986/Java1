package ketvirtaPaskaita;

import utils.ListUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Lina on 2017.06.09.
 */
public class MainApp1 {

    public static void main(String[] args) {
        arrayList();
    }

    private static void arrayList(){

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Arvydas");
        arrayList.add("Benas");
        arrayList.add("Aivaras");
        arrayList.add("Steponas");
        arrayList.add("Rima");
        for (String name : arrayList){
            if (name.length() > 6){
                System.out.println(name);
            }
        }
        System.out.println("Pirma listo reiksme: " + ListUtils.getFirstElement(arrayList));
        System.out.println("Paskutine listo reiksme: " + ListUtils.getLastElement(arrayList));
    }

}
