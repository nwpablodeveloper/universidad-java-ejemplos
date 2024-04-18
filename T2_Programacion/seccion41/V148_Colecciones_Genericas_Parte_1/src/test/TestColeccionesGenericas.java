package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestColeccionesGenericas {

    public static void main(String[] args) {

        List<Integer> miLista = new ArrayList<>();
        Set<String> miSet = new HashSet<>();
        Map<Integer, Character> miMap = new HashMap<>();

        miLista.add(35);
        miLista.add(8);
        miLista.add(9);
        miLista.add(35);
        
        // Imprimir La lista sin necesidad de hacer ninguna conversión
        Integer elemento = miLista.get(2);
        System.out.println("elemento = " + elemento);
        imprimirTipoEspecifico(miLista);

        miSet.add("Sophia");
        miSet.add("Romina");
        miSet.add("Pablo");
        miSet.add("Pablo"); // NO REPITE
        System.out.println("");
        imprimir(miSet);

        miMap.put(35, 'P');
        miMap.put(35, 'R');
        miMap.put(8, 'S');
        
        // Ejemplo lista sin especificar el tipo de dato
        List miListaSinTipado = new ArrayList();
        
        miListaSinTipado.add(334);
        miListaSinTipado.add("string");
        miListaSinTipado.add('d');
    }
    
    // Especificamos el tipo de coleccion
    public static void imprimir(Collection coleccion){
        coleccion.forEach( elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
    public static void imprimirTipoEspecifico(Collection<Integer> coleccion){
        coleccion.forEach( elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
}
