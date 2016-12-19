package ua.pp.lazin.strings;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Создайте программу, которая преобразовывает в строке "Dong-ding-
 * dong"
 * <p>
 *  выводит количество букв в строке
 * <p>
 *  сравнивает данную строку с любой другой, игнорируя регист
 * <p>
 *  все буквы к верхнему/нижнему регисту и выводит результат
 * <p>
 * на консоль
 * <p>
 *  выводит на консоль все индексы слова "dong"
 * <p>
 *  заменяет каждое вхождение слова dong на bong
 * <p>
 *  находит все одинаковые слова, подсчитывая их количество
 *
 * @author Ruslan Lazin
 */
public class StringModifierImpl implements IStringModifier {

    @Override
    public int countLetters(String string) {
        int count = 0;
        Pattern pattern = Pattern.compile("[\\p{L}]");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    @Override
    public boolean equalsIgnoreCase(String one, String two) {
        return !(one == null || two == null) && one.equalsIgnoreCase(two);
    }

    @Override
    public String stringToUpperCase(String string) {
        return string.toUpperCase();
    }

    @Override
    public String stringToLowerCase(String string) {
        return string.toLowerCase();
    }

    @Override
    public List<Integer> getIndexesOfWord(String givenString, String subString) {
        List<Integer> result = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\Q" + subString + "\\E");
        Matcher matcher = pattern.matcher(givenString);
        while (matcher.find()) {
            for (int i = matcher.start(); i < matcher.end(); i++) {
                result.add(i);
            }
        }
        return result;
    }


    @Override
    public String replaceWord(String str, String pattern, String replace) {
        return str.replaceAll("\\Q" + pattern + "\\E", replace);
    }

    @Override
    public Map<String, Integer> countIdenticalWords(String str) {
        HashMap<String, Integer> result = new HashMap<>();
        for (String word : str.split("[\\s,.;:!?-]+")) {
            word = word.toLowerCase();
            if (result.putIfAbsent(word, 1) != null) {
                result.put(word, result.get(word) + 1);
            }
        }
        Iterator iterator = result.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry thisEntry = (Map.Entry) iterator.next();
            if (thisEntry.getValue().equals(1)) {
                iterator.remove();
            }
        }
        return result;
    }
}
