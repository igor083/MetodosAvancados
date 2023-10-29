package Entities;

import Interface.Map;
import java.util.List;

import java.util.ArrayList;

public class ListToMapAdapter implements Map {
    private List<Integer> list = new ArrayList<Integer>();

    public ListToMapAdapter() {}

    @Override
    public void clear() {
        this.list.clear();
    }

    @Override
    public boolean containsKey(Integer key) {
        throw new Error("No tipo lista não existe key.");
    }

    @Override
    public boolean containsValue(Integer value) {
        return this.list.contains(value);
    }

    @Override
    public boolean equals(Object obj) {
        return this.list.equals(obj);
    }

    @Override
    public Integer get(Integer key) {
        return this.list.get(key);
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public boolean put(Integer value) {
        return this.list.add(value);
    }

    @Override
    public boolean remove(Integer item) {
        return this.list.remove(item);
    }

    @Override
    public Integer size() {
        return this.list.size();
    }

    @Override
    public Integer[] values() {
        Integer[] array = new Integer[this.list.size()];
        
        for (int i = 0; i < this.list.size(); i++) {
            array[i] = this.list.get(i);
        }
        
        return array;
    }
}


