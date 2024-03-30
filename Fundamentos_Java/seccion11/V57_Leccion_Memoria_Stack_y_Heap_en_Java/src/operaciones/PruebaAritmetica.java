package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        
        // Variables locales cargadas en la memoria STACK
        int a;
        int b;
        
        // Objeto cargado en la memoria HEAP
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica1 = " + aritmetica1.a);
        System.out.println("aritmetica1 = " + aritmetica1.b);
        
        System.out.println("");
        
        // Objeto cargado en la memora HEAP
        Aritmetica aritmetica2 = new Aritmetica(15, 30);
        System.out.println("aritmetica1 = " + aritmetica2.a);
        System.out.println("aritmetica1 = " + aritmetica2.b);
        
    }
}
