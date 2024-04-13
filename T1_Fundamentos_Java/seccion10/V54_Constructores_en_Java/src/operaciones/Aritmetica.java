package operaciones;

public class Aritmetica {
    int a;
    int b;
    
    // Constructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }
    
    
    
    public void sumar(){
        System.out.println( a + b);
    }
    
    public int sumarConRetorno(){
        return this.a + this.b;
    }
    
    public int sumarConParametros(int a, int b){
        this.a = a;
        this.b = b;
        return sumarConRetorno();
    }
    
}
