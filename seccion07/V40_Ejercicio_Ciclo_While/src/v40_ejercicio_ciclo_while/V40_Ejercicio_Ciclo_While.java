package v40_ejercicio_ciclo_while;

import java.util.Scanner;

public class V40_Ejercicio_Ciclo_While {
    public static void main(String[] args) {
        
        Scanner inputNum = new Scanner(System.in);
        
        System.out.println("Ingese cantidad de repeticiones");
        int repeticiones = Integer.parseInt(inputNum.nextLine());
        
        int contador = 1;
        
        while( contador <= repeticiones ){
            System.out.println("contador = " + contador);
            contador++;
        }
        
        
        
    }
    
}
