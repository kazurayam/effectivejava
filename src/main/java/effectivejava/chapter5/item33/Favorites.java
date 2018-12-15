package effectivejava.chapter5.item33;

import java.util.HashMap;
import java.util.Map;

public class Favorites {

    private Map<Class<?>, Object> favorites = new HashMap<>();

    public <T> void putFavorites(Class<?> type, T instance) {
    //    favorites.put(Objects.requireNonNull(type), instance);
    }
}
