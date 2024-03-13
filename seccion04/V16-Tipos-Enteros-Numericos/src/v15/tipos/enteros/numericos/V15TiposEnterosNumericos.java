package v15.tipos.enteros.numericos;

public class V15TiposEnterosNumericos {
    public static void main(String[] args) {

        // Tipo Short - puede almacenar hasta 16 bits
        System.out.println("Numero short = 32767");
        short numeroShort = 32767;
        System.out.println("MIN Short: " + Short.MIN_VALUE);
        System.out.println("MAX Short: " + Short.MAX_VALUE);
        
        System.out.println("Forzar 32768 a short");
        numeroShort = (short)32768;
        System.out.println("Conversion = " + numeroShort);
    }
}
