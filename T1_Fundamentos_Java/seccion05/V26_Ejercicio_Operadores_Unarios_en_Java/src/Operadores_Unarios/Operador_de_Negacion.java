package Operadores_Unarios;

public class Operador_de_Negacion {
    public static void main(String[] args) {
        
        var c = true;
        var d = !c;
        
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        d = !d;
        
        System.out.println("d = " + d);
        
    }
}
