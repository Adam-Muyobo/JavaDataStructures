package maps;

public interface Map<K, V> {
    /**
     * Inserts a key-value pair into the map.
     * @param key the key.
     * @param value the value.
     */
    void put(K key, V value);

    /**
     * Retrieves the value associated with a given key.
     * @param key the key to search for.
     * @return the value associated with the key, or null if the key is not present.
     */
    V get(K key);

    /**
     * Removes the key-value pair associated with a given key.
     * @param key the key to remove.
     */
    void remove(K key);

    /**
     * Checks if the map contains a given key.
     * @param key the key to check.
     * @return true if the key exists, false otherwise.
     */
    boolean containsKey(K key);

    /**
     * Returns the number of key-value pairs in the map.
     * @return the size of the map.
     */
    int size();
}

