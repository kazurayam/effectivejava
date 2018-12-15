package effectivejava.chapter6.item38;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;

public class ExtendedOperationTest {

    @Test
    public void testOperations() {
        double x = 2.0;
        double y = 4.0;
        test(ExtendedOperation.class, x, y);
    }

    private static <T extends Enum<T> & Operation> void test(
            Class<T> opEnumType, double x, double y
    ) {
        for (ExtendedOperation op : ExtendedOperation.values()) {
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
        }
    }

    @Test
    public void testOperation_boundedWildcardType() {
        double x = 2.0;
        double y = 4.0;
        test_boundedWildcardType(Arrays.asList(ExtendedOperation.values()), x, y);
    }

    private static void test_boundedWildcardType(
            Collection<? extends Operation> opSet, double x, double y) {
        for (Operation op : opSet) {
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
        }
    }
}
