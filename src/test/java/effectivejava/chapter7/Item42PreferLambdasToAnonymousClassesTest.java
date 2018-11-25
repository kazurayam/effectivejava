package effectivejava.chapter7;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import static java.util.Comparator.comparingInt;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;


/**
 * Effective Java, Chapter 7 Lambdas and Streams,
 * Item 42 Prefer lambdas to annonymous classes
 */
public class Item42PreferLambdasToAnonymousClassesTest {

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

    @Test
    public void testLambdaAsComparator() {
        List<String> words = new ArrayList<>(source);
        Collections.sort(words,
                (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println("[testLambdaAsComparator] sorted words: " + words.toString());
    }

    @Test
    public void testComparatorConstructionMethod() {
        List<String> words = new ArrayList<>(source);
        Collections.sort(words, comparingInt(String::length));
        System.out.println("[testComparatorConstructionMethod] sorted words: " + words.toString());
    }

    @Test
    public void testOperation1PLUS() {
        assertThat(Operation1.PLUS.apply(1.0, 2.0)).isEqualTo(3.0);
    }
}
