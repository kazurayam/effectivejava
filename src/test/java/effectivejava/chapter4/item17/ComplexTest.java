package effectivejava.chapter4.item17;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ComplexTest {

    @Test
    public void testToString() {
        assertThat(new Complex(1,2).toString()).isEqualTo("(1.0 + 2.0i)");
    }

    @Test
    public void testPlus() {
        Complex r = new Complex(1, 2).plus(new Complex(3,4));
        assertThat(r).isEqualTo(new Complex(4, 6));
    }

    @Test
    public void testMinus() {
        Complex r = new Complex(1,2).minus(new Complex(3,4));
        assertThat(r).isEqualTo(new Complex(-2, -2));
    }
}
