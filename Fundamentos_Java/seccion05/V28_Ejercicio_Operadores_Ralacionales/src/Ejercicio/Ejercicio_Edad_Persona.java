package Ejercicio;

import java.util.Scanner;

public class Ejercicio_Edad_Persona {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese una edad: ");
        int edad = Integer.parseInt(input.nextLine());
        
        if( edad >= 18 ) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        
    }
}
