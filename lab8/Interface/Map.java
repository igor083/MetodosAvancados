package Interface;

public interface Map {
    void clear();
    //o metodo remove recebe uma chave do tipo object.
    int remove(Object key);
    int get(Object key);
    int put(Object key, Object value);
    Object[] values();
    int size();
    boolean containsKey(Object key);
    boolean containsValue(Object value);
    boolean equals(Object obj);
    boolean isEmpty();
}
