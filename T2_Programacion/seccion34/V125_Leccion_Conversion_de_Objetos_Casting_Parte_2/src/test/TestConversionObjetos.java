package test;

import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        
        // Declaro un objeto de la clase padre
        Empleado empleado;
        
        // Pero le asigno un valor de la clase hija
        empleado = new Escritor("Pablo", 1500, TipoEscritura.CLASICO);
        
        
        /*
            El polimorfismo se va a encargar de ejecutar el método que correspondan
            que tienen el común la Clase Padre y un Override de la Clase hija
        */
        System.out.println("empleado = " + empleado.obtenerDetalles());
        
        
        /*
            No podemos acceder al método de la clase hija por que la variable
            se inicializo con una clase padre, a pesar de que luego cargamos
            sus atributos haciendo referencia a la clase hija.
            Al no tener métodos en común entra Clase Padre e Hija no podremos
            acceder a los mismos
        */
        // empleado.getTipoEscritura();
        
        /*
            Debemos realizar un DownCasting para poder tener accesos a todos
            los métodos y atributos de una clase hija.
        */
        
        
        // Convertir la variable a un tipo de Clase hija DOWNCASTING
        Escritor escritura = (Escritor)empleado;
        System.out.println("\nTipo Escritura: " + escritura.getTipoEscritura());
        
    }
}
