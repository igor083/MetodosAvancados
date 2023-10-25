package Entities;

import Interface.Map;
import java.util.HashMap;
import java.util.Map.Entry;

public class ListAdapter implements Map {
    private HashMap<Object, Object> map;

    public ListAdapter() {
        this.map = new HashMap<>();
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public void remove(Object key) {
        map.remove(key);
    }

    @Override
    public Object get(Object key) {
        return map.get(key);
    }

    @Override
    public void put(Object key, Object value) {
        map.put(key, value);
    }

    @Override
    public Object[] values() {
        return map.values().toArray();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return map.containsValue(value);
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
        return map.equals(other.map);
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }
}
