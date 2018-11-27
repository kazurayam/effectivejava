package effectivejava.chapter2.item1;

import java.math.BigInteger;
import java.util.Random;
import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class StaticFactoryMethodTest {

    @Test
    public void testBooleanValueOf() {
        Boolean b = Boolean.valueOf(true);
        assertThat(b).isInstanceOf(Boolean.class);
        //assertThat(b).isInstanceOf(String.class);
    }

    @Test
    public void testBigIntegerProbablePrime() {
        // returns a positive BigInteger that is probably prime, with the specified bit length.
        BigInteger bint = BigInteger.probablePrime(/* bitLength */ 31, /* rnd */ new Random());
        System.out.println("Probable prime: " + bint);
    }


}
