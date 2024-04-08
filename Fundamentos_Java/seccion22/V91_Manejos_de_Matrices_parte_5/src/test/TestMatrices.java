package test;

import domain.Persona;

public class TestMatrices {

    public static void main(String[] args) {

        /*
            Creando una matriz de Objetos Persona
        */

        Persona personas[][] = new Persona[2][3];
        
        personas[0][0] = new Persona("Pablo", 35);
        personas[0][1] = new Persona("Andres", 25);
        personas[0][2] = new Persona("Romina", 35);
        
        personas[1][0] = new Persona("Veronica", 33);
        personas[1][1] = new Persona("Sophia", 8);
        
        imprimir(personas);
    }
    
    public static void imprimir(Object matriz[][]){
        for (int row = 0; row < matriz.length; row++) {
            for (int col = 0; col < matriz[row].length; col++) {
                System.out.println("persona["+row+"]["+col+"] = " + matriz[row][col]);
            }
        }
    }
}
