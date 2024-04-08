package test;

import domain.Persona;

public class TestArreglosObjetos {
    public static void main(String[] args) {
        
        // Creaciópn del Arreglo del tipo Persona
        Persona personas[] = new Persona[3];
        
        // Cargando objetos en sus indices
        personas[0] = new Persona("Sophia", 8);
        personas[1] = new Persona("Romina", 35);
        personas[2] = new Persona("Andres", 35);
        
        // Modificando Objecto
        personas[2] = new Persona("Pablo", 35);
        
        // Interar los elementos del arreglo
        for(int i = 0; i < personas.length; i++){
            System.out.println("Persona " + i + ": " + personas[i]);
        }
    }
}
