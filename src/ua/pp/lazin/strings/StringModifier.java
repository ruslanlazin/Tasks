package ua.pp.lazin.strings;

import java.util.List;

/**
 * Created by Ruslan on 11/23/2016.
 */
public class StringModifier {

    public int length(String string) {
        return string.length();
    }

    public boolean equalsIgnoreCase(String one, String two){
        if(one==null || two == null) {
            return false;
        }
        return one.equalsIgnoreCase(two);
    }

    public String toUpperCase(String string){
        return string.toUpperCase();
    }

    public String toLowerCase(String string){
        return string.toLowerCase();
    }

    public List<Integer> getIndexesOf(String givenString, String subString){

    }
}
