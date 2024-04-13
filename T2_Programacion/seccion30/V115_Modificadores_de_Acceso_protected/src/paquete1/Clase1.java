package paquete1;

public class Clase1 {
    
    protected String atributoProtected = "Valor Atributo protected";
    
    /*
        Solo se puede crear Objetos con este contructor desde otras clases 
        que esten dentro del mismo paquete
    */
    protected Clase1(){
        System.out.println("Contructor Protected");
    }
    
    public Clase1(String arg){
        System.out.println("Constructor público");
    }
    
    protected void metodoProtected(){
        System.out.println("Método protected");
    }
    
}
