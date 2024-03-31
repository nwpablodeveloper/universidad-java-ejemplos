package clases;

public class Persona {
    
    public String nombre;
    public String apellido;
    
    public Persona(){
        System.out.println("Constructor vacio");
    }
    
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
}
