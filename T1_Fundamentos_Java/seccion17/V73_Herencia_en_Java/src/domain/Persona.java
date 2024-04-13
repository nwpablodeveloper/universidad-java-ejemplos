package domain;

public class Persona {

    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    protected int idPersona;
    
    private static int contadorPersonas;

    public Persona() {
        this.idPersona = ++Persona.contadorPersonas;
    }

    public Persona(String nombre){
        this.nombre = nombre;
    }
    
    public Persona(String nombre, char genero, int edad, String direccion){
        super();
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public char getGenero(){
        return this.genero;
    }
    
    public void setGenero(char genero){
        this.genero = genero;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append("nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        
        // Para ver la posición en memoria hacemos referencia a la clase padre Object de Java
        sb.append(",  ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
