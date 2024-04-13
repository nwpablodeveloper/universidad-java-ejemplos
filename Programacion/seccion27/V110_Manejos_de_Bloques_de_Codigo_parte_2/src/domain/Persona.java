package domain;

public class Persona {
    
    private final int idPersona;
    private static int contadorPersonas;
    
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
    
    public Persona(){
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
