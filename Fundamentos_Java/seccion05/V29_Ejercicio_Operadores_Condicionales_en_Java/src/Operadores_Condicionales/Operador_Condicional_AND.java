package Operadores_Condicionales;

public class Operador_Condicional_AND {
    public static void main(String[] args) {
        
        var a = 8;
        var valorMinimo = 0;
        var valorMaximo = 10;
        
        var resultado = a >= valorMinimo && a <= valorMaximo;
        
        if( resultado ) {
            System.out.println("Dentro de rango");
        } else {
            System.out.println("Fuera de rango");
        }
        
    }
}
