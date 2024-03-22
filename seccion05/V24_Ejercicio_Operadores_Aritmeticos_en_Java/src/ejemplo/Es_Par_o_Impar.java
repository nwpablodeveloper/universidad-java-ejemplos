package ejemplo;

import java.util.Scanner;

public class Es_Par_o_Impar {
    
    public static void main(String[] args) {
        
        Scanner numeros = new Scanner(System.in);
        
        System.out.println("Ingrese un nro. entero");
        int nro = Integer.parseInt(numeros.nextLine());
        
        
        if( nro % 2 == 0 ){
            System.out.println("Es Par");
        } else {
            System.out.println("Es impar");
        }
        
    }
    
}
