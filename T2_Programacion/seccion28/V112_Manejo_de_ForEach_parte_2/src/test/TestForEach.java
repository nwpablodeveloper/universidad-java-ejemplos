package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        
        int edades[] = {8, 35, 60, 16};
        for (int edad : edades) {
            System.out.println("edad: " + edad);
        }
        
        System.out.println("");
        
        // Ejemplo de ForEach cargando Objectos del tipo Persona
        Persona personas[] = { new Persona("Pablo"), new Persona("Sophia"), new Persona("Romina")};
        for (Persona persona : personas) {
            System.out.println("persona: " + persona);
        }
        
        System.out.println("");
        
        // Como seria usando un bucle for normal
                for (int i = 0; i < personas.length; i++) {
            System.out.println("Persona = " + personas[i]);
        }
    }
}
