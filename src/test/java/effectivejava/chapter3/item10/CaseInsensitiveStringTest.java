package effectivejava.chapter3.item10;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CaseInsensitiveStringTest {

    @Test
    public void testEquals() {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";
        assertThat(cis.equals(s)).isTrue();
    }

    @Test
    public void testSymmetricalEquals() {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";
        assertThat(s.equals(cis)).isFalse(); // Oh!
    }
}
