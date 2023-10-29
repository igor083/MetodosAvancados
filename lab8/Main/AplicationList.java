package Main;

import java.util.ArrayList;
import java.util.List;

import Entities.*;


public class AplicationList {
    public static void main(String[] args) {
        MapToListAdapter mapToListAdapter = new MapToListAdapter();

        mapToListAdapter.add(1);
        mapToListAdapter.add(2);

        System.out.println("Tamanho: " + mapToListAdapter.size());

        int itemParaVerificar = 1;
        boolean contemItem = mapToListAdapter.contains(itemParaVerificar);
        System.out.println("Contém " + itemParaVerificar + ": " + contemItem);

        int itemParaRecuperar = 2;
        Integer itemRecuperado = mapToListAdapter.get(itemParaRecuperar);
        System.out.println("Item recuperado " + itemParaRecuperar + ": " + itemRecuperado);

        int itemParaRemover = 1;
        mapToListAdapter.remove(itemParaRemover);
        System.out.println("Tamanho após remoção do " + itemParaRemover + ": " + mapToListAdapter.size());
        
       
        boolean estaVazia = mapToListAdapter.isEmpty();
        System.out.println("Está vazia: " + estaVazia);

        mapToListAdapter.clear();
        System.out.println("Tamanho após limpeza: " + mapToListAdapter.size());
    }
}
