package v24_ejercicio_operadores_aritmeticos_en_java;

public class V24_Ejercicio_Operadores_Aritmeticos_en_Java {
    public static void main(String[] args) {
        
        int a = 15, b = 6;
        System.out.println( "a = " + a + "\nb = " + b);
        System.out.println("");
        
        var resultado = a + b;
        System.out.println(resultado + "\t = suma");
        
        resultado = a - b;
        System.out.println(resultado + "\t = resta");
        
        resultado = a * b;
        System.out.println(resultado + "\t = Multiplicar");
        
        resultado = a / b;
        System.out.println(resultado + "\t = División ( solo parte entera )");
        
        var resultadoDouble = a / 3D;
        System.out.println( resultadoDouble+ "\t = División a / 3D");
        
        resultado = a % b;
        System.out.println(resultado + "\t = Resto entero de la división" );        
        
        
    }
}
