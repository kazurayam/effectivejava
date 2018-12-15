package effectivejava.chapter6.item36;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public class Text {
    public enum Style { BOLD, ITALIC, UNDERLINE, STRIKETHROUGH };

    private Set<Style> appliedStyles = null;

    public void applyStyles(Set<Style> styles) {
        appliedStyles = Objects.requireNonNull(styles);
    }

    public static void main(String[] args) {
        Text t = new Text();
        t.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
    }
}
