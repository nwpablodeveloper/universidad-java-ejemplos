package clases;

public class Prueba {
    public static void main(String[] args) {
        
        /* 
            CREACIÓN DEL 1er OBJETO Crea un espacion en memoria con una
            dirección exadecimal
        */
        Persona persona1 = new Persona(); 
        System.out.println("persona1 = " + persona1);
        
        // Asignación de valores a sus atributos
        persona1.nombre = "Pablo";
        persona1.apellido = "Veiga";
        
        // Hacemos llamados de sus metodos
        persona1.desplegarInformacion();
        
        /* 
            CREACIÓN DE UN 2do OBJETO - Crea otro espacio en memora con otra 
            dirección exadecimal
        */
        Persona persona2 = new Persona();
        
        // Asignamos valores a los atributos declarados en la clase
        persona2.nombre = "Romina";
        persona2.apellido = "Diaz";
        persona2.desplegarInformacion();
        
        // La siguiente copia hace referencia a la dirección exadecimal del objeto
        Persona persona3 = persona1;
        persona3.desplegarInformacion();
        
        System.out.println("");
        System.out.println("referencias en memoria");
        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);
        System.out.println("persona3 = " + persona3);
        
        System.out.println("");
        //Modificamos valores de un objeto y afecta al otro que copiamos por referencia
        persona1.nombre = "Juan";
        persona1.desplegarInformacion();
        persona3.desplegarInformacion();
    }
}
