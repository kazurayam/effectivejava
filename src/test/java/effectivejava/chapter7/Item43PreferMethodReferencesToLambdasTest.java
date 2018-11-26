package effectivejava.chapter7;

import static org.assertj.core.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Effective Java, Chapter 7 Lambdas and Streams,
 * Item 43 Prefer Method References to Lambdas
 */
public class Item43PreferMethodReferencesToLambdasTest {

    @Test
    public void testLambdaAsBiFunction() {
        Map<String, Integer> map = new HashMap<>();
        String key = "foo";
        map.merge(key, 1, (count, incr) -> count + incr);
        assertThat(map).containsKey("foo");
        // http://joel-costigliola.github.io/assertj/assertj-guava.html#quickstart
        assertThat(map).contains(entry("foo", 1));
    }

    @Test
    public void testMethodReference() {
        Map<String, Integer> map = new HashMap<>();
        String key = "foo";
        map.merge(key, 1, Integer::sum);
        assertThat(map).containsKey("foo");
        assertThat(map).contains(entry("foo", 1));
    }

    
}
