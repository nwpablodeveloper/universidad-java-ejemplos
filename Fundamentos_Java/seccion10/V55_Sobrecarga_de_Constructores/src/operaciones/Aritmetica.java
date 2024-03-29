package operaciones;

public class Aritmetica {
    int a;
    int b;
    
    // Constructor vacio
    public Aritmetica(){
        System.out.println("Constructor SIN argumentos");
    }
    
    // Sobrecarga de constructores
    public Aritmetica(int arg1, int arg2){
        System.out.println("Constructor CON Argumentos");
        this.a = arg1;
        this.b = arg2;
    }
    
    
    public void sumarConMetodoVoid(){
        System.out.println( "Suma con Metodo Void = " + ( a + b ));
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
