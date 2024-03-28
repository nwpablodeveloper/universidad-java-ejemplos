package operaciones;

public class Aritmetica {
    
    int a;
    int b;
    
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        int resultado = a + b;
        return resultado;
    }
}
