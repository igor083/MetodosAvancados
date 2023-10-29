package Interface;

import java.util.Iterator;

public interface List {
    void clear();
    void remove(Integer index);
    Object get(Integer index);
    void add(Integer item);
    Integer size();
    Iterator<Integer> iterator();
    boolean contains(Integer item);
    Object[] toArray();
    boolean isEmpty();
    boolean equals(Object item);
}