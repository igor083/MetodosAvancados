package Entities;

import Interface.*;
import java.util.HashMap;

public class ListAdapter implements Map {
    private List list;

    public ListAdapter(List list) {
        this.list = list;
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public void remove(Object key) {
        list.remove();
    }

    @Override
    public Object get(Object key) {
        return list.get(key);
    }

    @Override
    public void put(Object key, Object value) {
        list.put(key, value);
    }

    @Override
    public Object[] values() {
        return list.values().toArray();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean containsKey(Object key) {
        return list.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return list.containsValue(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAdapter other = (ListAdapter) obj;
        return list.equals(other.list);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
