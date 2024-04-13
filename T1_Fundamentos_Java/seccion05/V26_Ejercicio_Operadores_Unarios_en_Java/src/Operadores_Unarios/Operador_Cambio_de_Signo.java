package Operadores_Unarios;

public class Operador_Cambio_de_Signo {
    public static void main(String[] args) {
        
        var a = 3;
        var b = -a;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        b = +a;
        System.out.println("b = " + b);
        
    }
}
