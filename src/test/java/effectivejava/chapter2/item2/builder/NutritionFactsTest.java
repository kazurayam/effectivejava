package effectivejava.chapter2.item2.builder;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class NutritionFactsTest {

    @Test
    public void testBuilder() {
        NutritionFacts nf = new NutritionFacts.Builder(240, 8).
                calories(100).sodium(35).carbohydrate(27).
                build();
        assertThat(nf).isInstanceOf(NutritionFacts.class);
    }
}
