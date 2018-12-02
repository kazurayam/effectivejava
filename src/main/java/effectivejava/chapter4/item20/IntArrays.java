package effectivejava.chapter4.item20;

import java.util.Objects;
import java.util.AbstractList;
import java.util.List;

// Concrete implementation built atop skeltal implementaton
public class IntArrays {

    static List<Integer> intArrayList(int[] a) {
        Objects.requireNonNull(a);

        // The diamond operator is only legal here in Java 9 and later
        // If you're using an earlier release, specify <Integer>
        return new AbstractList<Integer>() {
            @Override
            public Integer get(int i) {
                return a[i];
            }

            @Override
            public Integer set(int i, Integer val) {
                int oldVal = a[i];
                a[i] = val;    // auto unboxing
                return oldVal; // auto boxing
            }

            @Override public int size() {
                return a.length;
            }
        };
    }
}
