package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        
        // Clases envolventes de tipos primitivos
        /*
            int - Integer
            long - Long
            float - Float
            double - Double
            boolean - Boolean
            byte - Byte
            char - Charcter
            short - Short
        */
        
        // int entero = 10;
        // AutoBoxing
        Integer entero = 10;
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.toString());
        System.out.println("entero = " + entero.doubleValue());
        
        System.out.println("");
        
        // Unboxing
        int entero2 = entero;
        System.out.println("entero2 = " + entero2);
    }
}
