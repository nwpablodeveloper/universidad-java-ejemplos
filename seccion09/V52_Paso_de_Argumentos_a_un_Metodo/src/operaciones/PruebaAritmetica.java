package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        
        Aritmetica aritmetica1 = new Aritmetica();

        int resultado = aritmetica1.sumarConArgumentos(20, 3);
        System.out.println("resultado = " + resultado);
    }
}
