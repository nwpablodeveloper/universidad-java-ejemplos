package v42_ejercicio_ciclo_for;

import java.util.Scanner;

public class V42_Ejercicio_Ciclo_For {
    public static void main(String[] args) {
        
        Scanner numero = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de repeticiones:");
        int repeticiones = Integer.parseInt(numero.nextLine());
        
        for(int contador = 0; contador < repeticiones; contador++ ){
            System.out.println("contador = " + contador);
        }
        
    }
    
}
