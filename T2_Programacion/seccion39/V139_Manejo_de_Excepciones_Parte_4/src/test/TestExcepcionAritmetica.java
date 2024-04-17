package test;

import static aritmetica.Aritmetica.division;

public class TestExcepcionAritmetica {
    public static void main(String[] args) {
        
        try {
            // Importación del método Static
            division(5, 0);
            
        } catch (Exception error) {
            System.out.println("Error al dividir por cero");
            // Pila de error
            error.printStackTrace(System.out);
            
            // Solo mensaje
            System.out.println("asdf: " + error.getMessage());
        }
    }
}
