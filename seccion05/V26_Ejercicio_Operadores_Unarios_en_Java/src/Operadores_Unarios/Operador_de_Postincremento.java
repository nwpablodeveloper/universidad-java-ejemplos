package Operadores_Unarios;

public class Operador_de_Postincremento {
    public static void main(String[] args) {
        
        var g = 3;
        var h = g++;
        System.out.println("h = " + h);
        System.out.println("g = " + g);
        
        g = 3;
        h = g--;
        System.out.println("h = " + h);
        System.out.println("g = " + g);
    }
}
