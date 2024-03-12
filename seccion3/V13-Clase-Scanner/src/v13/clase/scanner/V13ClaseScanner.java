package v13.clase.scanner;

import java.util.Scanner;

public class V13ClaseScanner {

    public static void main(String[] args) {
        
        /*
            Scanner es un tipo de datos que se utiliza 
            para ingresar datos del usuario y asginarlos 
            a las variables
        */
        System.out.println("Escribe tu nombre:");
        Scanner consola = new Scanner(System.in);
        
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        
        System.out.println("");
        System.out.println("Escriba su titulo: ");
        var titulo = consola.nextLine();
        System.out.println("titulo = " + titulo);
    }
}
