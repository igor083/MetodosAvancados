package Entities;

import Interface.Map;
import java.util.List;

import java.util.ArrayList;

public class ListToMapAdapter implements Map {
   private List<Integer> list = new ArrayList<Integer>();

   public ListToMapAdapter() {
   }

   @Override
   public void clear() {
      this.list.clear();
   }

   @Override
   public boolean containsKey(Integer key) {
      throw new RuntimeException();
   }

   @Override
   public boolean containsValue(Integer value) {
      return this.list.contains(value);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null || getClass() != obj.getClass()) {
         return false;
      }
      ListToMapAdapter other = (ListToMapAdapter) obj;
      return this.list.equals(other.list);
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
      if (!this.list.contains(value)) {
         return this.list.add(value);
      }
      return false; 
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
