package Entities;

import Interface.Map;
import java.util.HashMap;

public class ListAdapter implements Map {
    private HashMap<Object, Object> map; // Usamos um mapa para armazenar os pares chave-valor.

    public ListAdapter() {
        this.map = new HashMap<>(); // Inicializamos o mapa.
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public int remove(Object key) {
        if (map.containsKey(key)) {
            map.remove(key);
            return 1;
        }
        return 0;
    }

    @Override
    public int get(Object key) {
        if (map.containsKey(key)) {
            return 1;
        }
        return 0;
    }

    @Override
    public int put(Object key, Object value) {
        map.put(key, value);
        return 1;
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


