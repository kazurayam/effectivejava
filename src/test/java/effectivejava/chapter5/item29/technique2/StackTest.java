package effectivejava.chapter5.item29.technique2;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

public class StackTest {

    @Test
    public void testSmoke() {
        Stack<String> stack = new Stack<>();
        String[] args = { "foo", "bar", "baz" };
        for (String arg : args) {
            stack.push(arg);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop().toUpperCase());
        }
    }
}
