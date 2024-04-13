package proyecto;

import java.util.Scanner;

public class ProyectoCaja {
    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Ingrese el ancho de la caja");
        int ancho = Integer.parseInt(consola.nextLine());
        
        System.out.println("Ingrese el alto de la caja");
        int alto = Integer.parseInt(consola.nextLine());
        
        System.out.println("Ingrese la profundidad de la caja");
        int prof = Integer.parseInt(consola.nextLine());

        Caja caja0 = new Caja();
        caja0.alto = alto;
        caja0.ancho = ancho;
        caja0.profundo = prof;
        System.out.println("Volument caja0 = "+ caja0.calcularVolumen());
        
        Caja caja1 = new Caja(ancho, alto, prof);
        System.out.println("volumen caja1 = " + caja1.calcularVolumen());
        
    }
}
