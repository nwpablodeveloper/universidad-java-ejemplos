package v16.tipos.enteros.numericos;

public class V16TiposEnterosNumericos {
    public static void main(String[] args) {

        // Tipo Short - puede almacenar hasta 16 bits
        System.out.println("Ej. tipo de dato short:");
        System.out.println("MIN Short: " + Short.MIN_VALUE);
        System.out.println("MAX Short: " + Short.MAX_VALUE);
        System.out.println("Forzar 32768 a short");
        short numeroShort = (short)32768;
        System.out.println("Forzado = " + numeroShort);
        System.out.println("Hay perdida de precisión");
        
        // Tipo int - puede almacenar hasta 32 bits
        System.out.println("");
        System.out.println("Ej. tipo de dato int:");
        System.out.println("MIN int: " + Integer.MIN_VALUE);
        System.out.println("MAX int: " + Integer.MAX_VALUE);
        System.out.println("Forzar 2147483648 a int");
        int numeroInt = (int)2147483648L;
        System.out.println("forzado = " + numeroInt);
        System.out.println("Hay perdida de precisión");
        
        // Tipo Long - puede almacenar hasta 64 bits
        System.out.println("");
        System.out.println("Ej. Tipo de dato long");
        System.out.println("MIN long: " + Long.MIN_VALUE);
        System.out.println("MAX long: " + Long.MAX_VALUE);
        System.out.println("Forzar 9223372036854775808L a long");
        long numeroLong = (long)9223372036854775808F;
        System.out.println("Forzado = " + numeroLong);
        System.out.println("Hay perdida de precisión");
        
        
    }
}
