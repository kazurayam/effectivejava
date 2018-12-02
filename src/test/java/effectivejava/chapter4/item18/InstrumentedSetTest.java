package effectivejava.chapter4.item18;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

public class InstrumentedSetTest {

    @Test
    public void testSmoke() {
        Set<String> s = new HashSet<>();
        s.add("India");
        s.add("Australia");
        s.add("South Africa");
        InstrumentedSet<String> is = new InstrumentedSet<>(s);
        is.add("India");
        assertThat(is.getAddCount()).isEqualTo(1);
    }
}
