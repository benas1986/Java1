package utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lina on 2017.06.09.
 */
public class ListUtils {
    public static <T> T getFirstElement(List<T> list){
        return list.get(0);
    }

    public static <T> T getLastElement(List<T> list){
        return list.get(list.size()- 1);
    }

}

