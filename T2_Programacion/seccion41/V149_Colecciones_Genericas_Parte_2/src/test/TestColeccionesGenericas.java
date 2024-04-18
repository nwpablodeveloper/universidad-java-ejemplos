package test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TestColeccionesGenericas {

    public static void main(String[] args) {

        Map<Integer, String> miMap = new HashMap<>();

        miMap.put(4, "Pablo");
        miMap.put(5, "Romina");
        miMap.put(7, "Sophia");
        miMap.put(7, "Yazmin"); // Override

        System.out.println("Imprimir solo una ubicación indicando la llave");
        String elemento = miMap.get(7);
        System.out.println("elemento = " + elemento);

        System.out.println("\nImprimir todas las llaves del Map");
        
        // Imprimir todas las llaves
        imprimirKeys(miMap.keySet());
        
        System.out.println("\nImprimir todos los valores del Map");
        // Imprimir todas sus valores
        imprimirValues(miMap.values());
    }

    public static void imprimirKeys(Collection<Integer> llaves) {
        
        // Podemos usar un ciclor ForEcha conociendo su tipado
        for (Integer llave : llaves) {
            //System.out.println(llave);
        }
        
        llaves.forEach(llave -> {
            System.out.println("elemento= " + llave);
        });
    }

    public static void imprimirValues(Collection<String> values) {
        
        // Podemos usar un ciclor ForEcha conociendo su tipado
        for(String value: values){
            //System.out.println("value = " + value);
        }
        
        values.forEach( valor -> {
            System.out.println("elemento= " + valor);
        });
    }
}
