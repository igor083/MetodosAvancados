package Entities;

import Interface.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class MapToListAdapter implements List {
    private Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    public MapToListAdapter() {}

    @Override
    public void add(Integer item) {
        this.map.put(item, item);
    }

    @Override
    public void clear() {
        this.map.clear();
    }

    @Override
    public boolean contains(Integer item) {
        return this.map.containsKey(item);
    }

    @Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    MapToListAdapter other = (MapToListAdapter) obj;
    return this.map.equals(other.map);
}


@Override
public Integer get(Integer item) {
    Integer value = this.map.get(item);
    return value != null ? value : null;
}


    @Override
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override
    public Iterator<Integer> iterator() {
        return this.map.values().iterator();
    }

    @Override
    public void remove(Integer item) {
        this.map.remove(item);
    }

    @Override
    public Integer size() {
        return this.map.size();
    }

    @Override
    public Integer[] toArray() {
        return this.map.values().toArray(new Integer[this.map.size()]);
    }

}