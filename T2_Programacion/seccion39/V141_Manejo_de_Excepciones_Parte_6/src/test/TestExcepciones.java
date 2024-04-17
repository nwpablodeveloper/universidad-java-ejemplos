package test;

import excepciones.OperacionExcepcion;
import static aritmetica.Aritmetica.division;

public class TestExcepciones {

    public static void main(String[] args) {

        try {
            int resultado = division(5, 0);
            System.out.println("resultado = " + resultado);
        } catch (OperacionExcepcion e) {
            System.out.println("Ocurrio un error de tipo OperacionException: " );
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrio un error de tipo Exception: " );
            e.getMessage();;
        } finally {
            System.out.println("Finally siempre se dispara al final del Try/Catch");
        }
    }
}
