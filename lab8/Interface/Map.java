package Interface;

public interface Map {
    void clear();
    boolean containsKey(Integer key);
    boolean containsValue(Integer value);
    boolean equals(Integer obj);
    Integer get(Integer key);
    boolean isEmpty();
    boolean put(Integer value);
    boolean remove(Integer key);
    Integer size();
    Integer[] values();
}
