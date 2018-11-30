package effectivejava.chapter3.item10.composition;

import effectivejava.chapter3.item10.Color;
import effectivejava.chapter3.item10.Point;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ColorPointTest {

    @Test
    public void testSymmetricEquals() {
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);
        Point p = new Point(1, 2);
        assertThat(cp.asPoint().equals(p)).isTrue();
        //
        assertThat(p.equals(cp.asPoint())).isTrue();
    }
}
