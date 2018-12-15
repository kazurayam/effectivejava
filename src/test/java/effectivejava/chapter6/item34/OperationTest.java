package effectivejava.chapter6.item34;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class OperationTest {

    @Test
    public void testOperations() {
        double x = 2.0;
        double y = 4.0;
        for (Operation op : Operation.values()) {
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
        }
    }

}
