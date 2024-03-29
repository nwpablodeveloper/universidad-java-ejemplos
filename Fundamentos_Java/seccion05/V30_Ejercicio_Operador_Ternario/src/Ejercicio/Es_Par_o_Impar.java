package Ejercicio;

import java.util.Scanner;

public class Es_Par_o_Impar {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        
        int num = Integer.parseInt(input.nextLine());
        
        String resp = ( num % 2 == 0 ) ? "Es par" : "Es Impar";
        System.out.println("resp = " + resp);
        
    }
    
}
