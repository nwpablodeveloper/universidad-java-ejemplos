package domain;

public class Persona {
    
    private int idPersona;
    private String nombre;
    
    /*
        El atributo estatico se va a encargar de mantener su valor cada ves
        que se cree un Objeto con la clase que lo contenga.
        La variable con el modificador Static va a compartir su valor en común
        con todos los Object que ya se crearon con la misma clase.
    */
    private static int contadorPersonas;
    
    
    public Persona(String nombre){
        this.nombre = nombre;
        this.idPersona = Persona.contadorPersonas++;
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }

    /* 
        Con esta etiqueta significa que estamos sobreescribiendo el meotodo 
        toString que se hereda de la clase padre Object
    */
    @Override 
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append(", nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
