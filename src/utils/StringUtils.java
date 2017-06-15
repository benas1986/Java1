package utils;

/**
 * Created by Lina on 2017.06.14.
 */
public class StringUtils {

    public static boolean isNotBlank(String val){
       boolean isNotBlank = false;
        if (val != null && !val.equals("")){
            isNotBlank = true;
        }
        return isNotBlank;
    }

}
