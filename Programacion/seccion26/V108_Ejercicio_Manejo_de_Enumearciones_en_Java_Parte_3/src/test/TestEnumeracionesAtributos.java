package test;

import enumeracion.Continentes;

public class TestEnumeracionesAtributos {
    public static void main(String[] args) {
        
        System.out.println("4to Continente: " + Continentes.AMERICA);
        System.out.println("Tiene: " + Continentes.AMERICA.getPaises() + " paises" );
        
    }
}
