package Tests;

import org.junit.Before;
import org.junit.Test;

import Entities.ListToMapAdapter;

import static org.junit.Assert.*;


public class ListToMapAdapterTest {

    private ListToMapAdapter map;

    @Before
    public void setUp() {
        map = new ListToMapAdapter();
    }

    @Test(expected = RuntimeException.class)
    public void testContainsException() {
        map.containsKey(1);
    }

    @Test
    public void testContainsValue() {
        map.put(1);
        map.put(2);
        assertTrue(map.containsValue(1));
        assertFalse(map.containsValue(3));
    }

    @Test
    public void testEquals() {
        ListToMapAdapter map2 = new ListToMapAdapter();
        map.put(1);
        map.put(2);
        map2.put(1);
        map2.put(2);
        assertTrue(map.equals(map2));
    }

    @Test
    public void testGet() {
        map.put(1);
        map.put(2);
        assertEquals(Integer.valueOf(1), map.get(0));
        assertEquals(Integer.valueOf(2), map.get(1));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(map.isEmpty());
        map.put(1);
        assertFalse(map.isEmpty());
    }

    @Test
    public void testPut() {
        assertTrue(map.put(1));
        assertTrue(map.put(2));
        assertTrue(map.put(3));
        assertEquals(Integer.valueOf(3), map.size());
    }

    @Test
    public void testRemove() {
        map.put(1);
        map.put(2);
        assertTrue(map.remove(1));
        assertFalse(map.remove(3));
    }

    @Test
    public void testSize() {
        map.put(1);
        map.put(2);
        assertEquals(Integer.valueOf(2), map.size());
    }

    @Test
    public void testValues() {
        map.put(1);
        map.put(2);
        Integer[] expectedValues = {1, 2};
        assertArrayEquals(expectedValues, map.values());
    }
}
