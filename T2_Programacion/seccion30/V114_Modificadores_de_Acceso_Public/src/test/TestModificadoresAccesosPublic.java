package test;

import paquete1.Clase1;

public class TestModificadoresAccesosPublic {
    public static void main(String[] args) {
        
        /*
            Clase1 tiene un modifcaro Public y es por eso que podemos acceder
            a la misma desde otro paquete
        */
        Clase1 clase1 = new Clase1();
        System.out.println("clase1 = " + clase1);
        
        /*
            Si el atributo esta declarado como Public tambien vamos a poder
            acceder al mismo desde cualquier otro paquete
            clase.atributoPublico;
        */
        String contenido = clase1.atributoPublico;
        System.out.println("contenido = " + contenido);
        
        /*
            Accediendo al método Public
        */
        clase1.metodoPublic();
        
    }
}
