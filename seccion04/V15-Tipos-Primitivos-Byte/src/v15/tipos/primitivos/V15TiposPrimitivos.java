package v15.tipos.primitivos;

public class V15TiposPrimitivos {

    public static void main(String[] args) {

        /*
            Tipo primitivos de tipos enteros
            byte, short, int, long
         */
        
        byte numeroByte = 10; // sigue siendo un tipo entero
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Valor minimo del byte = " + Byte.MIN_VALUE);
        System.out.println("Valor minimo del byte = " + Byte.MAX_VALUE);
        // Convertir de entero a tipo byte
        System.out.println("Forzar 129 a byte");
        numeroByte = (byte)129;
        System.out.println("numeroByte2 = " + numeroByte);
    }

}
