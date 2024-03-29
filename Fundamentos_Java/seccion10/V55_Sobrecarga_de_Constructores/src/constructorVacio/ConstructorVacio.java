package constructorVacio;

public class ConstructorVacio {
    
    /* 
        Esta clase no tiene construcor ya que el compilador lo va a generar
        de forma automatica si es que el mismo no recibe ningún argumento o 
        no existe ningún otro constructor con argumentos en la clase
    */
    
    // Declaración de atributos
    int a; 
    int b;
    
    // Declaración de metodos.
    public void sumarConMetodoVoid(){
        System.out.println("Sumando con Metodo Void = " + ( this.a + this.b ) );
    }
    
}
