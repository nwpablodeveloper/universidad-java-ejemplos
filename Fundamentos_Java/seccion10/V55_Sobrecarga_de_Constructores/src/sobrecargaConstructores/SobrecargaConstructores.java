package sobrecargaConstructores;

public class SobrecargaConstructores {
    
    int a;
    int b;
    
    public SobrecargaConstructores(){
        System.out.println("Constructor Vacio");
    }
    
    public SobrecargaConstructores(int arg1, int arg2){
        System.out.println("Constructor con Argumentos");
        this.a = arg1;
        this.b = arg2;
    }
    
    public int sumarConRetorno(){
        return a + b;
    }
    
}
