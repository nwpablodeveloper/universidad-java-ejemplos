package test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestSet {

    public static void main(String[] args) {
        
        Set miSet = new HashSet();
        
        miSet.add("lunes");
        miSet.add("martes");
        miSet.add("miercoles");
        
        // Si el elemnto ya exsite el Set no lo va a agregar
        miSet.add("miercoles");
        miSet.add("miercoles");
        miSet.add("miercoles");

        // Interar con forEach
        for (Object elemento : miSet) {
            System.out.println("elemento = " + elemento);
        }
        
        System.out.println("");
        imprimir(miSet);
        
        
    }
    
    public static void imprimir(Collection coleccion){
        
        // Interar con funciòn felcha
        coleccion.forEach( elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
}
