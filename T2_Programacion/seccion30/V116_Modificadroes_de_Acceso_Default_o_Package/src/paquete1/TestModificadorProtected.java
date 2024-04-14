package paquete1;

import paquete1.ClaseDefault;
import paquete1.ClaseHija;

public class TestModificadorProtected {

    public static void main(String[] args) {

        /*
            Podemos acceder a una clase Default si es que estamos dentro
            del mismo paquete
        */
        ClaseDefault clase1 = new ClaseDefault();
        System.out.println("clase1 ref: " + clase1);
        
        /*
            Podemos acceder a los atributos default de la clase si es que 
            estamos dentro del mismo paquete
        */
        System.out.println("Atributo default: "+clase1.atributoDefault);
        
        
        System.out.println("\nUsando clases hija");
        
        // Pruebas con objetos de la clase hija
        ClaseHija clasehija1 = new ClaseHija();
        System.out.println("clasehija1 = " + clasehija1);
        
    }

}
