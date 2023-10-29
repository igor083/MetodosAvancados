package Main;

import Entities.*;


public class AplicationMap {
    public static void main(String[] args) {
        ListToMapAdapter listToMapAdapter = new ListToMapAdapter();

        // ----> PUT
        listToMapAdapter.put(1);
        listToMapAdapter.put(100);
        listToMapAdapter.put(80);
        listToMapAdapter.put(44);
        listToMapAdapter.put(39);

        // ----> SIZE
        System.out.println("Tamanho: " + listToMapAdapter.size());

        // ----> CONTAINS VALUE
        int itemParaVerificar = 1;
        boolean contemItem = listToMapAdapter.containsValue(itemParaVerificar);
        System.out.println("Contém " + itemParaVerificar + ": " + contemItem);

        // ----> EQUALS
        System.out.println("É igual: " + listToMapAdapter.equals(new ListToMapAdapter()));

        // ----> GET
        int itemParaRecuperar = 2;
        Integer itemRecuperado = listToMapAdapter.get(itemParaRecuperar);
        System.out.println("Item recuperado " + itemParaRecuperar + ": " + itemRecuperado);

        // ----> REMOVE
        System.out.println("Tamanho Antes de remover: " + listToMapAdapter.size());
        listToMapAdapter.remove(1);
        System.out.println("Tamanho Depois de remover: " + listToMapAdapter.size());

        // ----> ISEMPTY
        boolean estaVazia = listToMapAdapter.isEmpty();
        System.out.println("Está vazia: " + estaVazia);

        // ----> VALUES
        System.out.println("Values: ");
        for (Integer i : listToMapAdapter.values()) {
            System.out.println("-> "+i);
        }
        
        // ----> ITERATOR?
        //
        //

        // ----> CLEAR
        listToMapAdapter.clear();
        System.out.println("Tamanho após limpeza: " + listToMapAdapter.size());
    }
}
