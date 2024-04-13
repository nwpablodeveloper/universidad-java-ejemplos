package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        
        var resultado = Operaciones.sumar(5, 20);
        System.out.println("resultado = " + resultado);
        System.out.println("");
        
        resultado = Operaciones.sumar(5, 4, 3);
        System.out.println("resultado = " + resultado);
        System.out.println("");
        
        // Automaticamente va a ir al Método de la clase con este tipo de datos
        double resultadoD = Operaciones.sumar(154.2, 5);
        System.out.println("resultadoD = " + resultadoD);
        
    }
}
