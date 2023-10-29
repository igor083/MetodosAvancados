package Main;

import Entities.*;


public class AplicationMap {
    public static void main(String[] args) {
        ListToMapAdapter listToMapAdapter = new ListToMapAdapter();

        listToMapAdapter.put(1); 
        listToMapAdapter.put(2);
        listToMapAdapter.put(3);

        System.out.println("Size: " + listToMapAdapter.size()); 

        System.out.println("Contains Value 2: " + listToMapAdapter.containsValue(2)); 

        Integer[] values = listToMapAdapter.values();
        System.out.print("Values: ");
        for (Integer value : values) {
            System.out.print(value + " ");
        }

        listToMapAdapter.clear();
        System.out.println("\nIs Empty: " + listToMapAdapter.isEmpty());
    }
}
