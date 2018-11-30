package effectivejava.chapter3.item10.autovalue;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class AnimalTest {

    @Test
    public void testIsEqualTo() {
        Animal dog = Animal.create("dog", 4);
        assertThat(dog.name()).isEqualTo("dog");
        assertThat(dog.numberOfLegs()).isEqualTo(4);
    }

    @Test
    public void testIsNotEqualTo() {
        Animal dog = Animal.create("dog", 4);
        Animal cat = Animal.create("cat", 4);
        assertThat(dog.name()).isNotEqualTo(cat.name());
    }

}
