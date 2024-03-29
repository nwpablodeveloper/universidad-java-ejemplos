package constructorConArgumentos;

public class ConstructorArgumentos {
    
    int a;
    int b;
    
    /*
        En este caso como declaramos un constructor con argumentos el compilador
        no va a crear ningun constructor vacio y en caso de necesitar un 
        constructor vacio nos veremos obligados a tenerlo que declarar
    */
    public ConstructorArgumentos(int arg1, int arg2){
        System.out.println("Constructor con Argumentos");
        this.a = arg1;
        this.b = arg2;
    }
    
    public int sumarConRetorno(){
        return this.a + this.b;
    }
    
    
}
