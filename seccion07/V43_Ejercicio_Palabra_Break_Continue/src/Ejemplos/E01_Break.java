package Ejemplos;

import java.util.Scanner;

public class E01_Break {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.println("Indicar numero de repeticiones");
        int repe = Integer.parseInt(consola.nextLine());

        System.out.println("Ingrese un numero mayor a 0 y menor a: " + repe + " para terminar el ciclo");
        int romper = Integer.parseInt(consola.nextLine());

        for (int i = 0; i <= repe; i++) {
            if (i == romper) {
                System.out.println("El bucle se rompio en la posición nro.: " + romper);
                break;
            }
            System.out.println("Contador = " + i);
        }

        
        System.out.println("");
        /* 
            En un bucle que se repite del 0 al 100 lo vamos a finalizar cuando
            el contador llegue a 5
        */
        System.out.println("Romper ciclo en la 5ta repetición");
        
        int contador = 0;
        while( contador <= 100){
            if(contador == 5){
                break;
            }
            System.out.println("contador = " + contador);
            contador++;
        }
    }
}
