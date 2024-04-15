package test;

import domain.*;

public class TestDownCasting {
    public static void main(String[] args) {
        
        // Declaro como tipo Padre
        Empleado empleado;
        
        // Declaro con valores de tipo Hijo
        empleado = new Escritor("Pablo", 1700, TipoEscritura.CLASICO);
        
        // Puedo tener accesos con polimorfismo por que tengo métodos en común
        empleado.obtenerDetalles();
        
        // No tengo acceso a los métodos de la clase hija
        //escritor.getTipoEscritura();
        
        // Realizo un DownCasting ( Convertir de tipo padre a tipo hija )
        // ((Escritor)empleado.getTipoEscritura) // Forma directa
        Escritor escritor = ((Escritor)empleado); // Usando Variables
        // Ahora tengo acceso a todos los métodos y atributos de la clase hija
        escritor.getTipoEscritura();
        
    }
}
