package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        
        Aritmetica aritmetica1 = new Aritmetica();
        
        aritmetica1.a = 35;
        aritmetica1.b = 8;
        aritmetica1.sumar();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
    }
}
