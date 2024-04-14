package test;

import domain.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
        
        // Creamos un Objeto de la clase Hija
        Gerente gerente1 = new Gerente("Pablo", 245.50, "CNC");
        
        // Llamamos al método desde Objeto creado con la clase hija
        System.out.println(gerente1.obtenerDetalles());
        
    }
}
