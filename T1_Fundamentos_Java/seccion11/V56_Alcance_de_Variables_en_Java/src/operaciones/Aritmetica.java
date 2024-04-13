package operaciones;

public class Aritmetica {
    
    int a;
    int b;
    
    public Aritmetica(){
        System.out.println("Constructor sin parametros");
    }
    
    public Aritmetica(int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;
    }
    
    public void sumarConMetodo(){
        System.out.println("Sumar con metodo = " + ( this.a + this.b ));
    }
    
    public int sumarConRetorno(){
        return this.a + this.b;
    }
    
    public int sumarConArgumento(int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;
        return this.sumarConRetorno();
    }
    
}
