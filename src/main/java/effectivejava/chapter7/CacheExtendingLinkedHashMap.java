package effectivejava.chapter7;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * https://github.com/jbloch/effective-java-3e-source-code
 */
public class CacheExtendingLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
    
    private static final int MAX_ENTRIES = 100;

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > MAX_ENTRIES;
    }
    
}
