package test;

import domain.*;

public class TestPolimorfismo {

    public static void main(String[] args) {

        // Objeto creado con la clase Padre
        Empleado objeto = new Empleado("Pablo", 2500.20);
        // Llamar al metodo de la clase padre
        System.out.println("Metdo padre:\n"+ objeto.obtenerDetalles());
        
        // Objeto creado con la clase hija usando la variable que usamos en la clase padre
        objeto = new Gerente("Romina", 3200, "Cajas");
        // Llamar y sobreescribir el metodo de la clase padre en la clase hija
        System.out.println("\nMetodo @Override:\n" + objeto.obtenerDetalles());
        
        // Creaciones de objeto padre y haciendo uso de polimorfismo
        System.out.println("\nCon polimorfismo con objeto desde la clase padre");
        objeto = new Empleado("Sophia", 233);
        imprimir(objeto);
        
        System.out.println("\nCon polimorfismo con objeto desde la clase hija");
        objeto = new Gerente("Javier", 3500, "Muebles");
        imprimir(objeto);
    }

    /*
        Para aplicar el polimorfismo usaremos el tipo de dato mas gnerico, es 
        decir el de mayor gerarquia, en este caso usaremos el tipo de dato
        "Empleado" ya que corresponde a la clase mas generica
    */
    public static void imprimir(Empleado objeto){
        /*
            El polimorfismo va a imprimir el Metodo que corresponda infiriendo
            el tipo de dato que se le envie ya se hijo o padre.
        */
        String detalles = objeto.obtenerDetalles();
        System.out.println("Polimorfismo:\n" + detalles);
    }
}
