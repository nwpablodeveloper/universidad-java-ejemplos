package ejemplo;

import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Proporciones un caracter:");
        
        char caracter = consola.nextLine().charAt(1);
        
        System.out.println("caracter = " + caracter);
     
    }
}
