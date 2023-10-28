import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Entities.MapToListAdapter;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> teste = new HashMap<String, Integer>();
        List<Integer> lista = new ArrayList<Integer>();


        for (int i = 0; i < 20; i++) {
            teste.put("chave: "+i, i);
            lista.add(i);
        }

        System.out.println(teste.values());
        System.out.println(lista.toString());
    }  
}
