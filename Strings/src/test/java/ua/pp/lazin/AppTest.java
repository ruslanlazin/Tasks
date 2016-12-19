package ua.pp.lazin;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import ua.pp.lazin.strings.IStringModifier;
import ua.pp.lazin.strings.StringModifierImpl;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.*;

public class AppTest {
    private IStringModifier tester = new StringModifierImpl();

    @Test
    public void testLength() {
        assertTrue(tester.countLetters("Мат і Матіка надійслали Ґудзик Едіку. Welcome!") == 38);
    }

    @Test
    public void testEqualsIgnoreCase() {
        assertTrue(tester.equalsIgnoreCase("Java", "java"));
        assertFalse(tester.equalsIgnoreCase("BOB", "bobik"));
    }

    @Test
    public void testToUpperCase() {
        assertEquals("DAD", tester.stringToUpperCase("dad"));
    }


    @Test
    public void testToLowerCase() {
        assertEquals("mam?", tester.stringToLowerCase("MAM?"));
    }

    @Test
    public void testIndexes() {
        List<Integer> result = Arrays.asList(0, 1, 2);
        assertEquals(result, tester.getIndexesOfWord("c++ the best of the best", "c++"));
    }

    @Test
    public void testReplace() {
        assertEquals("Java the best choice",
                tester.replaceWord("c++ the best choice", "c++", "Java"));
    }

    @Test
    public void testCountIdenticalWords() {
        Map<String, Integer> identical = new HashMap<>();
        identical.put("sells", 4);
        identical.put("seashells", 2);
        identical.put("shells", 3);
        identical.put("the", 3);
        identical.put("she", 4);
        identical.put("seashore", 3);

        assertEquals(identical, tester.countIdenticalWords(
                "She sells seashells by the seashore." +
                        "The shells she sells are surely seashells.            " +
                        "So if she sells shells on the seashore," +
                        "I'm sure she sells seashore shells."));

        assertEquals(Collections.EMPTY_MAP, tester.countIdenticalWords(
                "I don't like her. She doesn't love me too"));
    }


    public static void main(String[] args) throws Exception {
        JUnitCore runner = new JUnitCore();
        Result result = runner.run(AppTest.class);
        System.out.println("run tests: " + result.getRunCount());
        System.out.println("failed tests: " + result.getFailureCount());
        System.out.println("ignored tests: " + result.getIgnoreCount());
        System.out.println("success: " + result.wasSuccessful());
    }
}
