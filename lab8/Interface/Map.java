package Interface;

public interface Map {
    void clear();
    void remove(Object key);
    Object get(Object key);
    void put(Object key, Object value);
    Object[] values();
    int size();
    boolean containsKey(Object key);
    boolean containsValue(Object value);
    boolean equals(Object obj);
    boolean isEmpty();
}
