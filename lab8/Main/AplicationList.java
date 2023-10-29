package Main;
import Entities.*;


public class AplicationList {
    public static void main(String[] args) {
        MapToListAdapter mapToListAdapter = new MapToListAdapter();

        // ----> ADD
        mapToListAdapter.add(1);
        mapToListAdapter.add(100);
        mapToListAdapter.add(80);
        mapToListAdapter.add(44);
        mapToListAdapter.add(39);

        // ----> SIZE
        System.out.println("Tamanho: " + mapToListAdapter.size());

        // ----> CONTAINS
        int itemParaVerificar = 1;
        boolean contemItem = mapToListAdapter.contains(itemParaVerificar);
        System.out.println("Contém " + itemParaVerificar + ": " + contemItem);

        // ----> EQUALS
        System.out.println("É igual: " + mapToListAdapter.equals(new MapToListAdapter()));

        // ----> GET
        int itemParaRecuperar = 2;
        Integer itemRecuperado = mapToListAdapter.get(itemParaRecuperar);
        System.out.println("Item recuperado " + itemParaRecuperar + ": " + itemRecuperado);

        // ----> REMOVE
        System.out.println("Tamanho Antes de remover: " + mapToListAdapter.size());
        mapToListAdapter.remove(1);
        System.out.println("Tamanho Depois de remover: " + mapToListAdapter.size());

        // ----> IS EMPTY
        boolean estaVazia = mapToListAdapter.isEmpty();
        System.out.println("Está vazia: " + estaVazia);

        // ----> TOARRAY
        System.out.println("To array: ");
        for (Integer i : mapToListAdapter.toArray()) {
            System.out.println("-> "+i);
        }
       
        // ----> CLEAR
        mapToListAdapter.clear();
        System.out.println("Tamanho após limpeza: " + mapToListAdapter.size());
    }
}
