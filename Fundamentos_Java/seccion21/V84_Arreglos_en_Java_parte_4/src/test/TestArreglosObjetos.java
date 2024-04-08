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
        
        System.out.println("personas 0: " + personas[0]);
        System.out.println("personas 1: " + personas[1]);
        System.out.println("personas 2: " + personas[2]);
    }
}
