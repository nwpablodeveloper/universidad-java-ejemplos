package test;

import domain.Persona;

public class TestArreglosObjetos {
    public static void main(String[] args) {
        
        /*
            Sintaxis resumida para crear un arreglo cargando sus valores en cada
            indice desde un prinicipio
        */
        String frutas[] = {"Mandarina", "Naranjas", "Frutillas", "uva"};
        
        for(int i = 0; i < frutas.length; i ++){
            System.out.println("Fruta " + i + ": " + frutas[i]);
        }
    }
}
