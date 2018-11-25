package effectivejava.chapter7;

import org.junit.Test;

import java.util.*;

import static java.util.Comparator.comparingInt;
import static org.assertj.core.api.Assertions.assertThat;


/**
 * Effective Java, Chapter 7 Lambdas and Streams,
 * Item 42 Prefer lambdas to annonymous classes
 */
public class Item43PreferMethodReferencesToLambdasTest {

    private List<String> source = new ArrayList<>(Arrays.asList("Johnny", "Jude", "Mat", "Eddie", "Colin", "Katherine"));

    @Test
    public void testAnonymousClass() {
        List<String> words = new ArrayList<>(source);
        Collections.sort(words, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
        System.out.println("[testAnonymousClass] sorted words: " + words.toString());
    }

}
