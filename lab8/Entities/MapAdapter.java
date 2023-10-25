package Entities;

import Interface.List;
import java.util.Map;
import java.util.Iterator;

public class MapAdapter implements List {
    private Map<Object, Object> map;

    public MapAdapter(Map<Object, Object> map) {
        this.map = map;
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public void remove(int index) {
        if (map instanceof List) {
            List list = (List) map;
            list.remove(index);
        }
    }

    @Override
    public Object get(int index) {
        if (map instanceof List) {
            List list = (List) map;
            return list.get(index);
        }
        return null;
    }

    @Override
    public void add(Object item) {
        if (map instanceof List) {
            List list = (List) map;
            list.add(item);
        }
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
    public Iterator iterator() {
        // You need to implement an Iterator for the Map values
        return map.values().iterator();
    }

    @Override
    public boolean contains(Object item) {
        return map.containsValue(item);
    }

    @Override
    public Object[] toArray() {
        return map.values().toArray();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }
}