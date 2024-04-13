package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 20;
        aritmetica1.b = 2;
        aritmetica1.sumarConMetodoVoid();
        
        int resultado = aritmetica1.sumarConParametros(55, 7);
        System.out.println("Sumar con Parametros = " + resultado);
        
        System.out.println("");
        
        Aritmetica aritmetica2 = new Aritmetica( 35, 8);
        int res = aritmetica2.sumarConRetorno();
        System.out.println("Sumar con Retorno = " + res);
        
    }
}
