package effectivejava.chapter2.item2.hierarchicalbuilder;

import static effectivejava.chapter2.item2.hierarchicalbuilder.Pizza.Topping.*;
import static effectivejava.chapter2.item2.hierarchicalbuilder.NyPizza.Size.*;
import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class PizzaTest {

    @Test
    public void testNyPizzaBuilder() {
        NyPizza np = new NyPizza.Builder(SMALL).
                addTopping(SAUSAGE).addTopping(ONION).build();
        assertThat(np).isInstanceOf(NyPizza.class);
    }

    @Test
    public void testCalzzoneBuilder() {
        Calzone cz = new Calzone.Builder().
                addTopping(HAM).sourceInside().build();
    }
}
