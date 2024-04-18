package test;

import genericos.ClaseGenerica;

public class TestClaseGeneric {
    public static void main(String[] args) {
        
        /*
            Para usar una clase Generica debemos espeficar el tipo 
            envolvente del dato primitivo que vamos a trabajar
        */ 
        ClaseGenerica<Integer> objeto1 = new ClaseGenerica(343443);
        ClaseGenerica<String> objeto2 = new ClaseGenerica("Texto");
        ClaseGenerica<Double> objeto3 = new ClaseGenerica(343.54);
        ClaseGenerica<Character> objeto4 = new ClaseGenerica('s');
        
        objeto1.conocerTipo("objeto1");
        objeto2.conocerTipo("objeto2");
        objeto3.conocerTipo("objeto3");
        objeto4.conocerTipo("objeto4");
        
    }
}
