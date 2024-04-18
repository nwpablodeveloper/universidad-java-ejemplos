package test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        
        Map miMap = new HashMap();
        
        // Cargando el Mapa con llaves.
        miMap.put("nombre", "pablo");
        miMap.put("apellido", "veiga");
        miMap.put(1, "Elemento en llave 1");
        miMap.put(17, "Elemento en llave 17");
        miMap.put("Canigo", "Elemento en llave \"Canigo\"");
        
        /*
            Recuperar un valor del mapa indicando la llave, el HasMap() regresa
            un dato de Tipo Objecto
        */
        String elemento  = (String)miMap.get("nombre");
        
        // Recuperar todo el mapa
        System.out.println("Imprimir todas las llaves");
        imprimir(miMap.keySet());
        
        System.out.println("\nImprimir todas los valores");
        imprimir(miMap.values());
    }
    
    public static void imprimir(Collection coleccion){
        
        coleccion.forEach( elemento -> {
            System.out.println("elemento = " + elemento);
        });
        
        
    }
}
