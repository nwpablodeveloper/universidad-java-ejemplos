package test;

import domain.*;

public class TestUpCasting {
    public static void main(String[] args) {
        
        Escritor escritor;
        escritor = new Escritor("Pablo", 1700, TipoEscritura.CLASICO);

        /*
            El TestUpCasting se puede asignar de forma directa la conversión
            de un tipo Hija a un tipo Padre
        */
        // Empleado empleado = (Empleado)escritor; No es necesario hacerlo explicito
        Empleado empleado = escritor;
        System.out.println(empleado.obtenerDetalles());
        
        
        
    }
}
