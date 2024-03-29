package ztarea_tienda_de_libros;

import java.util.Scanner;

public class ZTarea_Tienda_de_Libros {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Proporciones el nombre del libro:");
        String nombre = consola.nextLine();
        
        System.out.println("Proporciones el id: (numerico)?");
        int id = Integer.parseInt(consola.nextLine());
        
        System.out.println("Proporciones el precio (Con decimales)");
        double precio = Double.parseDouble(consola.nextLine());
        
        System.out.println("Acepta envio (true o false)");
        boolean envio = Boolean.parseBoolean(consola.nextLine());
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Id: " + id);
        System.out.println("Precio:  " + precio);
        System.out.println("Envio: " + envio);
    }
}
