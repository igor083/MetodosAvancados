package Interface;

public interface Map {
    void clear();
    boolean containsKey(Object key);
    boolean containsValue(Object value);
    boolean equals(Object obj);
    int get(Object key);
    boolean isEmpty();
    int put(Object key, Object value);
    int remove(Object key);
    int size();
    Object[] values();
}
