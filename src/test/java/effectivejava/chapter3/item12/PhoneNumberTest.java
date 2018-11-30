package effectivejava.chapter3.item12;

import java.util.HashMap;
import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class PhoneNumberTest {
    @Test
    public void testToString() {
        PhoneNumber ph = new PhoneNumber(707, 867, 5309);
        assertThat(ph.toString()).isEqualTo("707-867-5309");
    }
}
