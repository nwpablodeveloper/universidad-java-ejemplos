package test;

import domain.metodoFinal.Persona;


public class TestFinal {
    public static void main(String[] args) {
        
        final int miVariable  = 10;
        
        // No se puede modifcar por que la variable fue declarada como FINAL
        // miVariable = 23;
        
        System.out.println("Constante: " + Persona.MI_CONSTANTE);
    }
}
