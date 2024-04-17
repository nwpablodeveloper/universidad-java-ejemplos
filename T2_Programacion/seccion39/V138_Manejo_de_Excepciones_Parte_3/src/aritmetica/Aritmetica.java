package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica {

    /*
        Le tenemos que indicar al método que puede devolver una posible
        Excepcion. Hay que especificar su tipo en la firma del método
    */
    public static int division(int numerador, int denominador)
            throws OperacionExcepcion {

        if (denominador == 0) {
            // Tirar Excepcion personalizada. 
            throw new OperacionExcepcion("División entre cero");
        }

        return numerador / denominador;

    }

}
