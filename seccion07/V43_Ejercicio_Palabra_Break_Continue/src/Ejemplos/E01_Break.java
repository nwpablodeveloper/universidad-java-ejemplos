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
                break;
            }
            System.out.println("Contador = " + i);
        }

    }
}
