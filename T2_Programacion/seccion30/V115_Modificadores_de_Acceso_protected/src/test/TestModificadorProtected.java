package test;

import paquete1.Clase1;
import paquete1.Clase1;
import paquete2.ClaseHija;

public class TestModificadorProtected {

    public static void main(String[] args) {

        /*
            Creamos un objeto usando el constructor publico, el protected
            no pude ser utilizado desde otro paquete
        */
        Clase1 clase1 = new Clase1("Llamo al constuctor Público");
        System.out.println("clase1 ref = " + clase1);
        
        // No se puede acceder a los atributos protected desde otro paquete
        // clase1.metodoProtected;
        
        System.out.println("\nUsando clases hija");
        
        // Pruebas con objetos de la clase hija
        ClaseHija clasehija1 = new ClaseHija();
        System.out.println("clasehija1 = " + clasehija1);
        
    }

}
