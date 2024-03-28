package clases;

public class PruebaPersona {
    public static void main(String[] args) {
        
        // Declaramos una instancia de tipo Persona
        Persona persona1 = new Persona();
        
        // Ahora podemos asignarles valores a cada atributo del Object
        persona1.nombre = "Pablo";
        persona1.apellido = "Veiga";
        
        // Podemos hacer uso de sus metodos
        persona1.desplegarInformacion();
        
    }
}
