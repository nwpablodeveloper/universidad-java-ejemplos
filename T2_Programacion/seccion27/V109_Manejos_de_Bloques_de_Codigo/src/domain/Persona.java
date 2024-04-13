package domain;

public class Persona {
    
    private final int idPersona;
    private static int contadorPersonas;
    private String nombre;
    
    //
    static{
        System.out.println("Ejecución bloque estático");
        ++Persona.contadorPersonas;
    }
    
    // No Statico
    {
        System.out.println("Ejecución bloque NO estático");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    public Persona(String nombre){
        this.nombre = nombre;
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }
    
    
}
