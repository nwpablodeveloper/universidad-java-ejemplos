package v41_ejercicio_ciclo_do_while;

import java.util.Scanner;

public class V41_Ejercicio_Ciclo_Do_While {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.println("Ingrese cantidad de repeticiones");
        int repeticiones = Integer.parseInt(num.nextLine());

        int contador = 0;
        do {
            
            System.out.println("contador = " + contador);
            contador++;

        } while (contador <= repeticiones);

    }

}
