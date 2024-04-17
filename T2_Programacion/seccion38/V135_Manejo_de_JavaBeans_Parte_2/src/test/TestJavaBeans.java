package test;

import domain.Persona;

public class TestJavaBeans {
    public static void main(String[] args) {
        
        /*
            Solo creamos el objeto con el constructor vacio
        */
        Persona persona1 = new Persona();
        
        persona1.setNombre("Pablo");
        persona1.setApellido("Veiga");
        
        System.out.println("persona1 = " + persona1);
    }
}
