package effectivejava.chapter3.item11;

import java.util.HashMap;
import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class PhoneNumberTest {
    @Test
    public void testWithHashMap() {
        Map<PhoneNumber, String> m = new HashMap();
        m.put(new PhoneNumber(707, 867, 5309), "Jenny");
        String s = m.get(new PhoneNumber(707, 867, 5309));
        assertThat(s).isEqualTo("Jenny");
    }
}
