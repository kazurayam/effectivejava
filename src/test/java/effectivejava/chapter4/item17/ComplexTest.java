package effectivejava.chapter4.item17;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ComplexTest {

    @Test
    public void testToString() {
        assertThat(Complex.valueOf(1,2).toString()).isEqualTo("(1.0 + 2.0i)");
    }

    @Test
    public void testPlus() {
        Complex r = Complex.valueOf(1, 2).plus(Complex.valueOf(3,4));
        assertThat(r).isEqualTo(Complex.valueOf(4, 6));
    }

    @Test
    public void testMinus() {
        Complex r = Complex.valueOf(1,2).minus(Complex.valueOf(3,4));
        assertThat(r).isEqualTo(Complex.valueOf(-2, -2));
    }
}
