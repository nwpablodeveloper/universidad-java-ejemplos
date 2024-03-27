package Ejemplos;

public class E02_Continue {

    public static void main(String[] args) {

        System.out.println("Imprimir los números pares del 1 al 10");
        System.out.println("Usando bucle WHILE, DO WHILE Y FOR");

        int cont = 1;

        System.out.println("");
        System.out.println("Con bucle WHILE");
        while (cont <= 10) {
            if (cont % 2 != 0) {
                cont++;
                continue;
            }
            System.out.println("Es par =>\t " + cont);
            cont++;
        }

        System.out.println("");
        System.out.println("Con bucle DO WHILE");

        cont = 1;
        do {
            if (cont % 2 == 0) {
                System.out.println("Es par =>\t " + cont);
                cont++;
            }
            cont++;
            continue;
        } while (cont <= 10);

        System.out.println("");
        System.out.println("Con bucle FOR");

        for (cont = 1; cont <= 10; cont++) {
            if (cont % 2 != 0) {
                continue;
            }
            System.out.println("Es par =>\t " + cont);
        }

    }
}
