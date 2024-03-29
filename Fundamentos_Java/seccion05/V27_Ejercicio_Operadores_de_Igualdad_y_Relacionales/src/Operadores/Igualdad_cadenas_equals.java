package Operadores;

public class Igualdad_cadenas_equals {
    public static void main(String[] args) {
        
        var cadena1 = "Hola";
        var cadena2 = "Hola";
        
        var e = cadena1 == cadena2;

        var f = cadena1.equals(cadena2);
        System.out.println("f = " + f);
    }
}
