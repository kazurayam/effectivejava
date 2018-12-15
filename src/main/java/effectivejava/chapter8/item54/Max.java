package effectivejava.chapter8.item54;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Max {

    public static <E extends Comparable<E>> Optional<E> max(Collection<E> c) {
        if (c.isEmpty())
            return Optional.empty();
        E result = null;
        for (E e : c)
            if (result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);
        return Optional.of(result);
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList(args);
        System.out.println(max(words));

        // Using an optional to provide a chosen default value
        String lastWordInLexicon = max(words).orElse("No words...");
        System.out.println(lastWordInLexicon);
    }
}
