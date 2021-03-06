package ua.pp.lazin.strings;

import java.util.List;
import java.util.Map;

/**
 * @author Ruslan Lazin
 */
public interface IStringModifier {
    int countLetters(String string);

    boolean equalsIgnoreCase(String one, String two);

    String stringToUpperCase(String string);

    String stringToLowerCase(String string);

    List<Integer> getIndexesOfWord(String givenString, String subString);

    String replaceWord(String str, String pattern, String replace);

    Map<String, Integer> countIdenticalWords(String str);
}
