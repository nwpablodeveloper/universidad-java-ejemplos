package genericos;

/*
    Representamos una Clase de Generica tipo T
*/
public class ClaseGenerica<T> {
    
    private T atributo;
    
    public ClaseGenerica(T atributo){
        this.atributo = atributo;
    }
    
    public void conocerTipo(){
        String tipo = atributo.getClass().getSimpleName();
        System.out.println("El Objeto creado es de tipo: " + tipo);
    }
        
    
}