package test;

import domain.metodoFinal.Persona;

public class TestFinal {
    public static void main(String[] args) {
        
        Persona persona0 = new Persona();
        final Persona persona1 = new Persona();
        
        persona1.setNombre("Pablo");
        System.out.println("persona1 = " + persona1.getNombre());
        
        persona1.setNombre("Andres");
        System.out.println("persona1 = " + persona1.getNombre());
        
        /*
            Como el objeto persona1 esta como final ya no le podremos asignar
            a nueva referencia a este objecto
        */
        // persona1 = new Persona();

        persona0 = new Persona();
    }
}
