package effectivejava.chapter5.item33;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class FavoritesTest {

    @Test
    public void testSmoke() {
        Favorites f = new Favorites();
        f.putFavorites(String.class, "Java");
        f.putFavorites(Integer.class, 0xcafebebe);
        f.putFavorites(Class.class, Favorites.class);
        //String favoritesString = f.getFavorites(String.class);
        //int favoritesInteger = f.getFavorites(Integer.class);
        //Class<?> favoritesClass = f.getFavorites(Favorites.class);
        //System.out.printf("%s %x %s%n", favoritesString, favoritesInteger, favoritesClass);
    }
}
