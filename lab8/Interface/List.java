package Interface;

import java.util.Iterator;

public interface List {
    void clear();
    void remove(int index);
    Object get(int index);
    void add(Object item);
    Object[] values();
    int size();
    Iterator iterator();
    boolean contains(Object item);
    Object[] toArray();
    boolean isEmpty();
}