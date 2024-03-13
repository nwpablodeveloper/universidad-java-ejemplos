package tarea.v14.detalles.libro;

import java.util.Scanner;

public class TAREAV14DetallesLibro {
    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Ingrese el titulo del libro");
        String titulo = consola.nextLine();
        
        System.out.println("Ingrese el autordel libro");
        String autor = consola.nextLine();
        
        String libro = "Titulo: " + titulo + ",\n Autor: " + autor;
        System.out.println("libro:\n " + libro);
        
    }
}
