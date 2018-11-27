package effectivejava.chapter2.item2.telescopingconstructor;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class NutritionFactsTest {

    @Test
    public void testConstructor() {
        NutritionFacts nf = new NutritionFacts(240, 8, 100, 0, 35, 27);
        assertThat(nf).isInstanceOf(NutritionFacts.class);
    }


}
