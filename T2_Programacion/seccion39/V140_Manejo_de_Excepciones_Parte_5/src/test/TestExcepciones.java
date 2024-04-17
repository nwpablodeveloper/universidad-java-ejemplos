package test;

import static aritmetica.Aritmetica.division;

public class TestExcepciones {
  

    public static void main(String[] args) {

        /*
            Usando RunTimeException implementado en nuestra clase de Excepciones
            no estamos obligados a usar el Try/Catch pero el programa se va a 
            detener de forma abrupta si el error no es capturado
        */
        int resultado;
        resultado = division(5, 0);
        System.out.println("resultado = " + resultado);

    }
}
