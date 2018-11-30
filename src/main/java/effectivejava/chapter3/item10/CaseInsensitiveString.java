package effectivejava.chapter3.item10;

import java.util.Objects;

// Broken - violates symmetry
public final class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString)
            return s.equalsIgnoreCase(
                    ((CaseInsensitiveString) o).s);
        if (o instanceof String)   // One-way interoperability
            return s.equalsIgnoreCase((String) o);
        return false;
    }

}
