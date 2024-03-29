package Operadores_Unarios;
public class Operador_de_Preincremento {
    public static void main(String[] args) {
        
        var e = 3;
        var f = ++e;
        System.out.println("f = " + f);
        
        e = 3;
        f = --e;
        System.out.println("f = " + f);
        
    }
}
