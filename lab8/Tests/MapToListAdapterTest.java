package Tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import Entities.MapToListAdapter;

public class MapToListAdapterTest {

   private MapToListAdapter list;

   @Before
   public void setUp() {
      list = new MapToListAdapter();
   }

   @Test
   public void testAdd() {
      list.add(1);
      list.add(2);
      assertTrue(list.contains(1));
      assertTrue(list.contains(2));
   }

   @Test
   public void testClear() {
      list.add(1);
      list.add(2);
      list.clear();
      assertTrue(list.isEmpty());
   }

   @Test
   public void testContains() {
      list.add(1);
      list.add(2);
      assertTrue(list.contains(1));
      assertTrue(list.contains(2));
      assertFalse(list.contains(3));
   }

   @Test
   public void testEquals() {
      MapToListAdapter list2 = new MapToListAdapter();
      list.add(1);
      list.add(2);
      list2.add(1);
      list2.add(2);
      assertTrue(list.equals(list2));
   }

   @Test
   public void testGet() {
      list.add(1);
      list.add(2);
      assertEquals(Integer.valueOf(1), list.get(1));
      assertEquals(Integer.valueOf(2), list.get(2));
   }

   @Test
   public void testIsEmpty() {
      assertTrue(list.isEmpty());
      list.add(1);
      assertFalse(list.isEmpty());
   }

   @Test
   public void testRemove() {
      list.add(1);
      list.add(2);
      list.remove(1);
      assertFalse(list.contains(1));
      assertEquals(Integer.valueOf(1), list.size());
   }

   @Test
   public void testSize() {
      list.add(1);
      list.add(2);
      assertEquals(Integer.valueOf(2), list.size());
   }

   @Test
   public void testToArray() {
      list.add(1);
      list.add(2);
      Integer[] expectedArray = { 1, 2 };
      assertArrayEquals(expectedArray, list.toArray());
   }
}
